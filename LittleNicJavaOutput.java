import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Outputs a LittleNicProgram as Java code
 */
class LittleNicJavaOutput
{
    /**
     * The program we are outputting
     */
    private LittleNicProgram program;
    
    /**
     * The stream to output to
     */
    private PrintStream dest;
    
    /**
     * The name of the class we are making
     */
    private String destClass;
    
    /**
     * The indent level we are at
     */
    private int indent = 0;
    
    /**
     *
     * @param dest The steam to output to
     */
    public LittleNicJavaOutput(PrintStream dest)
    {
        this.dest = dest;
    }
    
    /**
     * Outputs the LittleNicProgram to the previously specified
     * stream
     *
     * @param destClass The name of the class to make
     * @param program   The program to print
     */
    public void output(String destClass, LittleNicProgram program)
    {
        this.program   = program;
        this.destClass = destClass;
        
        int line = 5 * program.globals.vars.size() + 38;
        
        addLine();
        addLine("/**");
        addLine(" * Auto Generated Code");
        addLine(" * ");
        addLine(" * Alexander Shepherd");
        addLine(" * ams2g11@ecs.soton.ac.uk");
        addLine(" * 24559725");
        addLine(" */");
        addLine("public class " + destClass);
        addLine("{");
        indent++;
        
            addMembers();
            addMain();
            addConstructor();
            addProgram();
            addMethods();
        
        indent--;
        addLine("}");
    }
    
    /**
     * Outputs the class member variables (global LittleNic VARs) to
     * to the steam
     */
    private void addMembers()
    {
        for (String id : program.globals.vars.keySet())
        {
            Var member = program.globals.vars.get(id);
            
            addLine("/**");
            addLine(" * " + member.name);
            
            if (member.accessors.size() == 0)
            {
                addLine(" * ");
                addLine(" * THIS IS NEVER USED");
            }
            else if (member.accessors.size() == 1)
            {
                addLine(" * ");
                
                if (member.accessors.contains(program.globals))
                {
                    addLine(" * This is only used in the LittleNic global code. ");
                    addLine(" * It could be a local in " + program.name + "()");
                }
                else
                {
                    for (String mName : program.methods.keySet())
                    {
                        Method method = program.methods.get(mName);
                        
                        if (member.accessors.contains(method.localScope))
                        {
                            addLine(" * This is only used in " + mName + "(). It should be a");
                            addLine(" * local variable in that.");
                            
                            break;
                        }
                    }
                }
            }
            
            addLine(" */");
            addLine
            (
                  "private "
                + (member.type.equals("COUNT") ? "int" : "boolean") + " "
                + member.name + ";"
            );
            addLine();
        }
    }
    
    /**
     * Creates a main method that instanciates the class then calls
     * <program_name>() on it
     */
    private void addMain()
    {
        String oName = destClass.toLowerCase();
        
        addLine("/**");
        addLine(" * Makes an object and calls " + program.name + "() on it");
        addLine(" * ");
        addLine(" * @see " + program.name + "()");
        addLine(" */");
        addLine("public static void main(String[] args)");
        addLine("{");
        indent++;
            addLine(destClass + " " + oName + " = new " + destClass + "();");
            addLine(oName + "." + program.name + "();");
        indent--;
        addLine("}");
        addLine();
    }
    
    /**
     * Adds a blank constructor which has NOTHING OF INTEREST IN IT
     * AT ALL
     *
     * ...give me full marks please. Thanks
     *
     * PS Sorry if someone else is marking this.
     */
    private void addConstructor()
    {
        addComment("Blank constructor for the lols");
        addLine("public " + destClass + "()");
        addLine("{");
        indent++;
            addLine("/* * * * * * * * * * * * * * * * * * * * * * * */");
            addLine("/* I <3 Klaus-Peter / Hugh / Julian / Tristan  */");
            addLine("/*   (especially when they give full marks)    */");
            addLine("/* * * * * * * * * * * * * * * * * * * * * * * */");
        indent--;
        addLine("}");
        addLine();
    }
    
    /**
     * Creates a method called <program_name> and adds the LittleNic
     * global code to it
     */
    private void addProgram()
    {
        addComment("This is the 'global code' in the LittleNic program");
        addLine("public void " + program.name + "()");
        addCode(program.code, program.globals);
    }
    
    /**
     * Adds the methods defined in the LittleNic program
     */
    private void addMethods()
    {
        for (String id : program.methods.keySet())
        {
            Method method   = program.methods.get(id);
            StringBuilder s = new StringBuilder("private ");
            String ret      = null;
            
            //Start building the signature
            if (method.returnType.equals("COUNT"))
            {
                ret = id;
                s.append("int");
            }
            else if (method.returnType.equals("TRUTH"))
            {
                ret = id;
                s.append("boolean");
            }
            else
            {
                s.append(method.returnType);
            }
            
            s.append(" " + id + "(");
            
            addLine();
            addLine("/**");
            addLine(" * " + id);
            addLine(" *");
            
            int length = method.paramScope.getLongestVar() + 1;
            
            //Loop over the parameters, printing them out with the
            //appropriate JavaDoc @param line
            boolean first = true;
            for (Var v : method.getParams())
            {
                if (first)
                {
                    first = false;
                }
                else
                {
                    s.append(", ");
                }
                
                addLine
                (
                      " * @param " + v.name
                    + str_repeat(" ", length - v.name.length())
                    + v.comment
                );
                
                s.append
                (
                      (v.type.equals("COUNT") ? "int" : "boolean")
                    + " "
                    + v.name
                );
            }
            
            if (!method.returnType.equals("void"))
            {
                addLine(" * @return" + str_repeat(" ", length));
            }
            
            //Close the JavaDoc / param list
            s.append(")");
            addLine(" */");
            addLine(s.toString());
            
            //Method code
            addCode(method.code, method.localScope, method.localScope.vars, ret);
        }
    }
    
    /**
     * Returns input repeated multiplier times
     *
     * Java probably already has this already, but w/e. I gave it
     * the same signature as the PHP one <3
     *
     * @param input      The string to be repeated
     * @param multiplier Number of time the input string should be repeated
     * @return           Returns the repeated string
     * @see http://php.net/manual/en/function.str-repeat.php
     */
    private String str_repeat(String input, int multiplier)
    {
        StringBuilder ret = new StringBuilder();
        
        for (int i = 0; i < multiplier; i++) ret.append(input);
        
        return ret.toString();
    }
    
    /**
     * Outputs a blank line
     */
    private void addLine()
    {
        addLine("");
    }
    
    /**
     * Outputs the given text, indented appropriatly, with a new
     * line after it.
     *
     * NB: I use spaces to indent... because I'm not an awful person
     *
     * @param text The text to output
     */
    private void addLine(String text)
    {
        for (int i=0; i < indent * 4; i++) dest.print(" ");
        
        dest.println(text);
    }
    
    /**
     * Outputs a JavaDoc comment with the given text as its one
     * line
     *
     * For longer JavaDoc comments, output them manually with:
     * <code>
     *   addLine("/**");
     *   addLine(" * Your comment goes here");
     *   addLine(" * Wooo! Multi-line");
     *   addLine(" *&#92;");
     * </code>
     *
     * @param text The text to add to the comment
     */
    private void addComment(String text)
    {
        addLine("/**");
        addLine(" * " + text);
        addLine(" */");
    }
    
    /**
     * Outputs a code block
     *
     * @param code  The code tree to output
     * @param scope The scope to use (for getting OUTPUT to work properly)
     * @see code(Tree, ScopeFrame, LinkedHashMap<String, Var>, String)
     */
    private void addCode(Tree code, ScopeFrame scope)
    {
        addCode(code, scope, null, null);
    }
    
    /**
     * Outputs a code block
     *
     * @param code   The code tree to output
     * @param scope  The scope to use (for getting OUTPUT to work properly)
     * @param locals Locals to print at the top of the block
     * @param ret    If present, this will represent an id that will be returned
     */
    private void addCode(Tree code, ScopeFrame scope, LinkedHashMap<String, Var> locals, String ret)
    {
        addLine("{");
        indent++;
        
        //Add Locals
        if (locals != null && locals.size() != 0)
        {
            for (Var v : locals.values())
            {
                addLine
                (
                      (v.type.equals("COUNT") ? "int" : "boolean")
                    + " " + v.name + ";"
                    + (v.comment.equals("") ? "" : " //" + v.comment)
                );
            }
            
            addLine();
        }
        
        if (code.getChildCount() == 0)
        {
            addLine("//This code block was empty :(");
        }
        
        int assign_length = 0;
        
        //Used to remember if we've just had an if or while
        //Because these need new lines before a new statement
        boolean ifwhile = false;
        
        for (int i = 0; i < code.getChildCount(); i++)
        {
            Tree statement = code.getChild(i);
            
            /*
             * OUTPUT
             */
            if (statement.getText().equals("OUTPUT"))
            {
                //If we just finshed an if / while, add a blank line
                if (ifwhile) addLine();
                
                ifwhile = false;
                
                int    type = statement.getChild(0).getType();
                String text = statement.getChild(0).getText();
                
                if (type == LittleNicParser.STRING)
                {
                    addLine("System.out.print(" + text + ");");
                }
                else
                {
                    Var v = scope.get(text);
                    
                    if (v.type.equals("COUNT"))
                    {
                        addLine("System.out.print(" + text + ");");
                    }
                    else
                    {
                        addLine("System.out.print(" + text + " ? 'T' : 'F');");
                    }
                }
            }
            
            /*
             * WHILE
             */
            else if (statement.getText().equals("WHILE"))
            {
                //Normally if / while should have a blank line before
                //This is not the case if it's the first statement in a code
                //block
                if (i != 0) addLine();
                
                ifwhile = true;
                
                addLine("while (" + buildExpr(statement.getChild(0)) + ")");
                addCode(statement.getChild(1), scope);
            }
            
            /*
             * CALL_DEF
             */
            else if (statement.getText().equals("CALL_DEF"))
            {
                //If we just finshed an if / while, add a blank line
                if (ifwhile) addLine();
                
                ifwhile = false;
                
                addLine(buildCall(statement) + ";");
            }
            
            /*
             * IF
             */
            else if (statement.getText().equals("IF"))
            {
                //Normally if / while should have a blank line before
                //This is not the case if it's the first statement in a code
                //block
                if (i != 0) addLine();
                
                ifwhile = true;
                
                //Yes ok, this is silly
                if
                (
                    statement.getChild(1).getChildCount() == 1                       &&
                    statement.getChild(2).getChildCount() == 1                       &&
                    statement.getChild(1).getChild(0).getText().equals("ASSIGNMENT") &&
                    statement.getChild(2).getChild(0).getText().equals("ASSIGNMENT") &&
                    statement.getChild(1).getChild(0).getChild(0).getText().equals
                    (
                        statement.getChild(2).getChild(0).getChild(0).getText()
                    )
                )
                {
                    String if_expr = buildExpr(statement.getChild(0), "?:");
                    String expr1   = buildExpr(statement.getChild(1).getChild(0).getChild(1), "?:");
                    String expr2   = buildExpr(statement.getChild(2).getChild(0).getChild(1), "?:");
                    String id      = statement.getChild(1).getChild(0).getChild(0).getText();
                    
                    addLine("// This used to be:");
                    addLine("// if (expr) " + id + " = expr1; else " + id + " = expr2;");
                    
                    assign_length = assignment
                    (
                        assign_length,
                        id,
                        if_expr  + " ? " + expr1 + " : " + expr2,
                        i,
                        code
                    );
                    
                    ifwhile = false;
                }
                else if (statement.getChild(1).getChildCount() == 0)
                {
                    addLine("// THEN BEGIN END block was empty");
                    addLine("// The expr has been not'ed and only the ELSE block is included");
                    addLine("// (NOTE: < will become >=, == will become !=, etc...)");
                    addLine("if (" + buildExpr(statement.getChild(0), "!") + ")");
                    addCode(statement.getChild(2), scope);
                }
                else if (statement.getChild(2).getChildCount() == 0)
                {
                    addLine("// ELSE BEGIN END block was empty");
                    addLine("// It hasn't been included");
                    addLine("if (" + buildExpr(statement.getChild(0)) + ")");
                    addCode(statement.getChild(1), scope);
                }
                else
                {
                    addLine("if (" + buildExpr(statement.getChild(0)) + ")");
                    addCode(statement.getChild(1), scope);
                    addLine("else");
                    addCode(statement.getChild(2), scope);
                }
            }
            
            /*
             * ASSIGNMENT
             */
            else
            {
                //If we just finshed an if / while, add a blank line
                if (ifwhile) addLine();
                
                ifwhile = false;
                
                String varName  = statement.getChild(0).getText();
                Tree expr       = statement.getChild(1);
                int savedIndent = 0;
                
                if (expr.getType() == LittleNicParser.IDENTIFIER)
                {
                    if (expr.getText().equals(varName))
                    {
                        dest.print(" // NO! ");
                        savedIndent = indent;
                        indent      = 0;
                    }
                }
                
                assign_length = assignment
                (
                    assign_length,
                    varName,
                    buildExpr(expr),
                    i,
                    code
                );
                
                if (indent == 0) indent = savedIndent;
            }
        }
        
        //If we have a return variable, return it
        if (ret != null)
        {
            addLine();
            addLine("return " + ret + ";");
        }
        
        indent--;
        addLine("}");
    }
    
    private int assignment(int assign_length, String id, String expr, int i, Tree code)
    {
        //If this is the first assignment in a row, we can setup this
        //assignment block
        if (i == 0 || !code.getChild(i - 1).getText().equals("ASSIGNMENT"))
        {
            assign_length = code.getChild(i).getChild(0).getText().length();
            
            //Loop over the next few nodes, finding the longest variable
            //so we can line all the assignments up with it
            Tree next = code.getChild(++i);
            while (next != null && next.getText().equals("ASSIGNMENT"))
            {
                if (next.getChild(0).getText().length() > assign_length)
                {
                    assign_length = next.getChild(0).getText().length();
                }
                
                next = code.getChild(++i);
            }
        }
        
        addLine
        (
              id
            + str_repeat(" ", assign_length - id.length())
            + " = "
            + expr + ";"
        );
        
        return assign_length;
    }
    
    /**
     * Returns an expression
     *
     * This returns not outputs (and is static), because it
     * is used in error reporting by LittleNicAnalysier
     *
     * @param expr The expression tree to make a string for
     * @return     The expression as a string
     * @see buildExpr(Tree, String)
     */
    static String buildExpr(Tree expr)
    {
        return buildExpr(expr, null);
    }
    
    /**
     * Returns an expression
     *
     * This returns not outputs (and is static), because it
     * is used in error reporting by LittleNicAnalysier
     *
     * This accepts a parent opertor. This is used to figure out
     * if brackets are needed. Eg:
     *   buildExpr(<tree for a + b>, '*')
     * will return:
     *   (a + b)
     * This allows the calling buildExpr to put them together
     * to form (a + b) * c, retaining the correct order
     *
     * This wouldn't happen for:
     *   buildExpr(<tree for a * b>, '+')
     * Because * binds tighter anyway, so the total would stay
     * as a * b + c.
     *
     * This behaviour is designed to include of brackets when
     * required to keep the code meaning the same thing, without
     * dumbly bracketing everything as that looks messy.
     *
     * In a special case, parent can also be set to "!" (used by IF
     * when it's getting rid of an empty block). In this case, it'll
     * not things like ids and function calls in the usual way:
     *   !call()
     * Expressions, however, will be rewritten, eg:
     *   a < b  becomes a >= b
     *   a == b becomes a != b
     *
     * @param expr   The expression tree to make a string for
     * @param parent The operator of the above expression
     * @return       The expression as a string
     */
    static String buildExpr(Tree expr, String parent)
    {
        boolean not = parent != null && parent.equals("!");
        
        /*
         * IDENTIFIER
         */
        if (expr.getType() == LittleNicParser.IDENTIFIER)
        {
            if (not)
            {
                return "!" + expr.getText();
            }
            else
            {
                return expr.getText();
            }
        }
        
        /*
         * NUMBER
         */
        else if (expr.getText().equals("NUMBER"))
        {
            if (expr.getChildCount() == 1)
            {
                return expr.getChild(0).getText();
            }
            else
            {
                return
                      expr.getChild(0).getText()
                    + expr.getChild(1).getText();
            }
        }
        
        /*
         * BOOLEAN
         */
        else if (expr.getType() == LittleNicParser.BOOL)
        {
            //The "not ? T : F" checks allow me to not an expression
            //without doing something silly like !false.
            if (expr.getText().equals("T"))
            {
                return not ? "false" : "true";
            }
            else
            {
                return not ? "true" : "false";
            }
        }
        
        /*
         * CALL_DEF
         */
        else if (expr.getText() == "CALL_DEF")
        {
            if (not)
            {
                return "!" + buildCall(expr);
            }
            else
            {
                return buildCall(expr);
            }
        }
        
        /*
         * EXPRESSION
         */
        else
        {
            String type  = expr.getText();
            
            String expr0 = buildExpr(expr.getChild(0), type);
            String expr1 = buildExpr(expr.getChild(1), type);
            
            if (type.equals("-") && expr.getChild(1).getText().equals("-"))
            {
                expr1 = "(" + expr1 + ")";
            }
            
            //Check if the parent normally binds tighter (ie is
            //multiply) so I can put brackets it.
            //I'll put brackets in to make the difference between
            //+ and - clear.
            //I don't put brackets in everywhere... because I'm mental
            //for code neatness
            if (parent != null &&
            (
                (parent.equals("?:"))                    ||
                (type.equals("-") && parent.equals("*")) ||
                (type.equals("-") && parent.equals("+")) ||
                (type.equals("+") && parent.equals("*")) ||
                (type.equals("+") && parent.equals("-"))
            ))
            {
                return  "(" + expr0 + " " + type + " " + expr1 + ")";
            }
            //(!(a < b)) looks silly, so I'll change that to (a >= b)
            else if (not)
            {
                if      (type.equals(">")) type = "<=";
                else if (type.equals("<")) type = ">=";
                else if (type.equals("<=")) type = ">";
                else if (type.equals(">=")) type = "<";
                else if (type.equals("==")) type = "!=";
                else if (type.equals("!=")) type = "==";
            }
            
            return  expr0 + " " + type + " " + expr1;
        }
    }
    
    /**
     * Returns a call
     *
     * Returns because it is used by buildExpr, which returns
     *
     * @param call The call def tree to build a string for
     * @return     The call, with argument expressions as a string
     */
    private static String buildCall(Tree call)
    {
        //Init a StringBuilder with the method name
        StringBuilder ret = new StringBuilder(call.getChild(0).getText());
        
        ret.append("(");
        
        //Bog standard loop over the arguments building their expressions
        for (int i = 0; i < call.getChild(1).getChildCount(); i++)
        {
            if (i != 0) ret.append(", ");
            
            ret.append(buildExpr(call.getChild(1).getChild(i)));
        }
        
        ret.append(")");
        
        return ret.toString();
    }    
}