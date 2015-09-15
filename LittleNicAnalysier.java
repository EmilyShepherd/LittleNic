import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Performs contextural analysis on a LittleNic AST
 */
class LittleNicAnalysier
{
    /**
     * Errors will be reported to this
     */
    private ErrorReporter err;
    
    /**
     * The name of the program
     */
    private String name;
    
    /**
     * Set of global variables
     */
    private ScopeFrame globals;
    
    /**
     * The program's global code
     */
    private Tree globalCode;
    
    /**
     * Set of methods
     */
    private HashMap<String, Method> methods = new HashMap<String, Method>();
    
    /**
     * The method we are currently in
     *
     * @depreciated
     */
    private Method inMethod;
    
    /**
     * 
     * @param err The error reporter
     */
    public LittleNicAnalysier(ErrorReporter err)
    {
        this.err = err;
    }
    
    /**
     * Starts analysis
     *
     * @param tree The AST to analyse
     * @return     The The LittleNicProgram, ready to print
     */
    public LittleNicProgram analyse(CommonTree tree)
    {
        this.name       = tree.getChild(0).getText();
        
        this.globals    = new ScopeFrame(null);
        declarations(tree.getChild(1), true, globals);
        
        this.globalCode = tree.getChild(2);
        code(globalCode, globals);
        
        return new LittleNicProgram(name, globals, globalCode, methods);
    }
    
    /**
     * Looks for an id in the current scope and reports an error
     * if it's not found
     *
     */
    private Var searchForId(String id, ScopeFrame scope, int line, int pos)
    {
        Var v = scope.get(id);
        
        if (v == null)
        {
            err.reportUndeclaredError(line, pos, id);
                
            return null;
        }
        else
        {
            return v;
        }
    }
    
    /**
     * Process declarations
     *
     * @param dec    The declaration tree
     * @param global Is this global declarations or inner declarations?
     * @param _scope The scope to add declarated variables to
     */
    private void declarations(Tree dec, boolean global, ScopeFrame _scope)
    {
        LinkedHashMap<String, Var> scope = _scope.vars;
        
        for (int i = 0; i < dec.getChildCount(); i++)
        {
            Tree   next = dec.getChild(i);
            String name = next.getChild(0).getText();
            
            //Check for name conflicts
            if
            (
                (scope.containsKey(name))               ||
                (global && methods.containsKey(name))   ||
                (!global && name.equals(inMethod.name)) ||
                (name.equals(this.name))
            )
            {
                err.reportNameError
                (
                    next.getLine(),
                    next.getCharPositionInLine(),
                    name
                );
            }
            
            //Variable
            if (next.getText().equals("VAR"))
            {
                scope.put
                (
                    name,
                    new Var
                    (
                        name,
                        next.getChild(1).getText()
                    )
                );
            }
            //This is a method.
            //Procedures and functions are treated the same
            else
            {
                method(next);
            }
        }
    }
    
    /**
     * Process a method (procedure / function)
     *
     * @param method The method tree
     */
    private void method(Tree method)
    {
        inMethod = new Method(method.getChild(0).getText());
        methods.put(inMethod.name, inMethod);
        
        //Params
        inMethod.paramScope = new ScopeFrame(globals);
        declarations(method.getChild(1), false, inMethod.paramScope);
        
        /*
         * PROCEDURE
         */
        if (method.getText().equals("PROCEDURE"))
        {
            inMethod.returnType = "void";
            
            inMethod.localScope = new ScopeFrame(inMethod.paramScope);
            declarations(method.getChild(2), false, inMethod.localScope);
            inMethod.code       = method.getChild(3);
        }
        
        /*
         * FUNCTION
         */
        else
        {
            inMethod.returnType = method.getChild(2).getText() ;
            
            inMethod.localScope = new ScopeFrame(inMethod.paramScope);
            declarations(method.getChild(3), false, inMethod.localScope);
            inMethod.code       = method.getChild(4);
            
            //Make up a local variable for the return
            Var local     = new Var(inMethod.name, inMethod.returnType);
            local.comment = "Return Variable";
            inMethod.localScope.vars.put(inMethod.name, local);
        }
        
        //Process the method code
        code(inMethod.code, inMethod.localScope);
        
        //Check for locals shadowing params
        for (Var v : inMethod.getParams())
        {
            //A local variable is shadowing this param
            //bury it in the sands of silly spec requirements
            if (inMethod.localScope.vars.containsKey(v.name))
            {
                v.name    = "_" + v.name;
                v.comment = "INACCESSIBLE - Shadowed by a local";
            }
        }
    }
    
    /**
     * Processes code
     *
     * @param code  The code tree to process
     * @param scope The code's scope to work with
     */
    private void code(Tree code, ScopeFrame scope)
    {
        for (int i = 0; i < code.getChildCount(); i++)
        {
            Tree statement = code.getChild(i);
            
            /*
             * OUTPUT
             */
            if (statement.getText().equals("OUTPUT"))
            {
                if (statement.getChild(0).getType() == LittleNicLexer.IDENTIFIER)
                {
                    searchForId
                    (
                        statement.getChild(0).getText(),
                        scope,
                        statement.getChild(0).getLine(),
                        statement.getChild(0).getCharPositionInLine()
                    );
                }
            }
            
            /*
             * IF
             */
            else if (statement.getText().equals("IF"))
            {
                truthExpr(statement.getChild(0), scope, "IF");
                code(statement.getChild(1), scope);
                code(statement.getChild(2), scope);
            }
            
            /*
             * WHILE
             */
            else if (statement.getText().equals("WHILE"))
            {
                truthExpr(statement.getChild(0), scope, "WHILE");
                code(statement.getChild(1), scope);
            }
            
            /*
             * ASSIGNMENT
             */
            else if (statement.getText().equals("ASSIGNMENT"))
            {
                Var v = searchForId
                (
                    statement.getChild(0).getText(),
                    scope,
                    statement.getChild(0).getLine(),
                    statement.getChild(0).getCharPositionInLine()
                );
                
                String type = expr(statement.getChild(1), scope);
                
                if (type != null && v != null && !v.type.equals(type))
                {
                    err.reportTypeError
                    (
                        statement.getChild(1).getLine(),
                        statement.getChild(0).getText(),
                        v.type,
                        LittleNicJavaOutput.buildExpr(statement.getChild(1)),
                        type
                    );
                }
            }
            
            /*
             * CALL_DEF
             */
            else if (statement.getText().equals("CALL_DEF"))
            {
                String type = call(statement, scope);

                //Apparently we aren't allowed to use functions
                //as procedures? Kind of random but whatevs
                if (type != null && !type.equals("void"))
                {
                    err.reportTypeError
                    (
                        statement.getLine(),
                        "statement",
                        "void",
                        LittleNicJavaOutput.buildExpr(statement),
                        type
                    );
                }
            }
        }
    }
    
    /**
     * Processes a call
     *
     * @param calldef The tree of the call
     * @param scope   The scope this call was made in
     * @return        The method's return type
     */
    private String call(Tree calldef, ScopeFrame scope)
    {
        Method method;
        String methodName = calldef.getChild(0).getText();
        
        //Check if method exists
        if (methods.containsKey(methodName))
        {
            method = methods.get(methodName);
        }
        else if (inMethod != null && inMethod.name.equals(methodName))
        {
            method = inMethod;
        }
        else
        {
            err.reportUndeclaredError
            (
                calldef.getChild(0).getLine(),
                calldef.getChild(0).getCharPositionInLine(),
                calldef.getChild(0).getText()
            );
            
            return null;
        }
        
        //Get the info about the method and its params
        ArrayList<Var> params  = method.getParams();
        
        //Check the number of param to args matches
        if (params.size() != calldef.getChild(1).getChildCount())
        {
            err.reportTypeError
            (
                calldef.getLine(),
                methodName,
                methodName + "(" + params.size() + ")",
                methodName,
                methodName + "(" + calldef.getChild(1).getChildCount() + ")"
            );
            
            //Even though this was an error, we know the method's return
            //type, so let's return it so we can report any other errors
            //in the code
            return method.returnType;
        }
        
        //Check the passed args are ok
        for (int i = 0; i < calldef.getChild(1).getChildCount(); i++)
        {
            Tree param = calldef.getChild(1).getChild(i);
            
            //params can be expressions
            String type = expr(param, scope);
            
            //Check that the type matches that of the parameter
            if (type != null && !params.get(i).type.equals(type))
            {
                err.reportTypeError
                (
                    param.getLine(),
                    params.get(i).name,
                    params.get(i).type,
                    LittleNicJavaOutput.buildExpr(param),
                    type
                );
            }
        }
        
        return method.returnType;
    }
    
    /**
     * Processes an expression, and reports an error if it
     * doesn't return a TRUTH
     *
     * Used by the IF and WHILE checks in code()
     *
     * @param expr  The expression tree to process
     * @param scope The scope this expression is in
     * @param fail  The expr / id to print if it failed
     * @see expr()
     * @see code()
     */
    private void truthExpr(Tree expr, ScopeFrame scope, String fail)
    {
        String type = expr(expr, scope);
        
        if (type != null && !type.equals("TRUTH"))
        {
            err.reportTypeError
            (
                expr.getLine(),
                fail, "TRUTH",
                LittleNicJavaOutput.buildExpr(expr),
                type
            );
        }
    }
    
    /**
     * Processes an expression
     *
     * It will try to return the return type of the expression. If an
     * error occurs (eg a var / function) is referenced that doesn't
     * exist, it will return null. It will attempt to report type errors
     * in other branches, but it won't allow an error to bubble up, eg:
     *   (5 + f()) * 2
     * This will report "UNDECLARED f()" and not:
     *   UNDECALRED f()
     *   TYPE MISMATCH BETWEEN 5 AND UNDECLARED
     *
     * @param expr  The expression tree to process
     * @param scope The scope this expression is in
     * @return      The return type of this expression (TRUTH / COUNT)
     */
    private String expr(Tree expr, ScopeFrame scope)
    {
        /*
         * NUMBER
         */
        if (expr.getText().equals("NUMBER"))
        {
            return "COUNT";
        }
        
        /*
         * BOOLEAN
         */
        else if (expr.getType() == LittleNicParser.BOOL)
        {
            return "TRUTH";
        }
        
        /*
         * ID
         */
        else if (expr.getType() == LittleNicParser.IDENTIFIER)
        {
            Var id = searchForId
            (
                expr.getText(),
                scope,
                expr.getLine(),
                expr.getCharPositionInLine()
            );
            
            return id != null ? id.type : null;
        }
        
        /*
         * CALL_DEF
         */
        else if (expr.getText().equals("CALL_DEF"))
        {
            String type = call(expr, scope);
            
            if (type == null) return null;
            
            //Fool's trying to call a procedure in an expression
            if (type.equals("void"))
            {
                err.reportTypeError
                (
                    expr.getLine(),
                    "expr",
                    "TRUTH / COUNT",
                    LittleNicJavaOutput.buildExpr(expr),
                    "void"
                );
                return null;
            }
            
            return type;
        }
        
        /*
         * EXPRESSION
         */
        else
        {
            //Process each side of the expression
            String type0 = expr(expr.getChild(0), scope);
            String type1 = expr(expr.getChild(1), scope);
            
            //These should all be counts
            if (type0 != null && !type0.equals("COUNT"))
            {
                err.reportTypeError
                (
                    expr.getLine(),
                    LittleNicJavaOutput.buildExpr(expr.getChild(1)),
                    type1,
                    LittleNicJavaOutput.buildExpr(expr.getChild(0)),
                    type0
                );
            }
            else if(type1 != null && !type1.equals("COUNT"))
            {
                err.reportTypeError
                (
                    expr.getLine(),
                    LittleNicJavaOutput.buildExpr(expr.getChild(0)),
                    type0,
                    LittleNicJavaOutput.buildExpr(expr.getChild(1)),
                    type1
                );
            }
            
            if
            (
                expr.getText().equals("*") ||
                expr.getText().equals("+") ||
                expr.getText().equals("-")
            )
            {
                return "COUNT";
            }
            else
            {
                return "TRUTH";
            }
        }
    }
}