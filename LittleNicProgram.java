import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.HashMap;

/**
 * Holds a LittleNicProgram
 */
public class LittleNicProgram
{
    /**
     * The program's name
     */
    String name;
    
    /**
     * The globals for the program
     */
    ScopeFrame globals;
    
    /**
     * The program's global code
     */
    Tree code;
    
    /**
     * All methods defined in the program
     */
    HashMap<String, Method> methods;
    
    /**
     *
     * @param name    The program's name
     * @param globals The globals for the program
     * @param code    The program's global code
     * @param methods All methods defined in the program
     */
    LittleNicProgram(String name, ScopeFrame globals, Tree code, HashMap<String, Method> methods)
    {
        this.name    = name;
        this.globals = globals;
        this.code    = code;
        this.methods = methods;
    }
}