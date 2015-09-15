import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.ArrayList;

public class LittleNic
{
    private ErrorReporter err;
     
    /**
     * 
     */
    public LittleNic()
    {
        
    }

    /**
     * THIS METHOD SHOULD BE FILLED OUT TO CALL YOUR PARSER AND
     * IMPLEMENT YOUR CROSS-COMPILER. THE SOURCE MUST BE READ 
     * FROM THE CHARSTREAM, ANY JAVA GENERATED MUST BE PASSED TO THE
     * DEST PRINTSTREAM WITH THE CLASS NAME GIVEN,
     * AND ALL ERRORS MUST BE PASSED TO THE ERROR REPORTER.
     * @param source        stream to read LittleNic source from
     * @param dest          stream to write any generated java to
     * @param destClassName class name to give the generated java class
     * @param errReporter   object to report any errors to
     */
    public void compile
    (
        CharStream source, PrintStream dest,
        String destClass,
        ErrorReporter err
    ) 
    {
        this.err              = err;
        CommonTree tree       = parse(source);
        LittleNicProgram prog = null;
        
        if (tree != null)
        {
            prog = context(tree);
        }
        
        if (err.numErrorsReported() == 0)
        {
            output(destClass, dest, prog);
        }
    }
    
    /**
     * Sets off the lexer and parser
     *
     * @param source The source to parse
     * @return       The AST
     */
    private CommonTree parse(CharStream source)
    {
        try
        {
            //Set up lexer and parser
            LittleNicLexer l         = new LittleNicLexer(source);
            CommonTokenStream tokens = new CommonTokenStream(l);
            LittleNicParser g        = new LittleNicParser(tokens);
            l.err = err;
            g.err = err;
            
            CommonTree tree = (CommonTree)g.prog().getTree();
            
            if (err.numErrorsReported() == 0)
            {
                return tree;
            }
        }
        catch (RecognitionException ex)
        {
            err.reportSyntaxError
            (
                ex.line,
                ex.charPositionInLine,
                ex.toString()
            );
            return null;
        }
        
        //Fail
        return null;
    }
    
    /**
     * Sets of contexural analysis
     *
     * @param tree The AST to analyse
     * @return     A little nic program
     */
    private LittleNicProgram context(CommonTree tree)
    {
        LittleNicAnalysier an = new LittleNicAnalysier(err);
        
        return an.analyse(tree);
    }
    
    /**
     * Outputs the code
     *
     * @param destClass The name of the class to create
     * @param dest      The stream to output to
     * @param prog      The LittleNicProgram to write
     */
    private void output(String destClass, PrintStream dest, LittleNicProgram prog)
    {
        LittleNicJavaOutput o = new LittleNicJavaOutput(dest);
            
        o.output(destClass, prog);
    }
}
