import java.util.ArrayList;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

/**
 * Holds information about a method defined in a LittleNic program
 */
public class Method
{
    /**
     * The method's name
     */
    String name;
    
    /**
     * The return type of the method
     * TRUTH / COUNT for FUNCTIONs
     * void for PROCEDUREs
     */
    String returnType;
    
    /**
     * The method's paramters
     */
    ScopeFrame paramScope;
    
    /**
     * The method's local variables
     */
    ScopeFrame localScope;
    
    /**
     * The method's code
     */
    Tree code;
    
    /**
     * Builds a method from a name
     *
     * Other stuff gets added after but it needs to exist
     * even if just as a shell as soon as it's seen, so that
     * recursive calls work
     *
     * @param name The method's name
     */
    Method(String name)
    {
        this.name = name;
    }
    
    /**
     * Retursn the method's parameters as an ArrayList
     *
     * @return The method's parameters, as an ArrayList
     */
    ArrayList<Var> getParams()
    {
        return new ArrayList<Var>(paramScope.vars.values());
    }
}