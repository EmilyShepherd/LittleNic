import java.util.HashSet;

/**
 * Holds information about a variable
 */
public class Var
{
    /**
     * The varaible's name
     */
    String name;
    
    /**
     * The variable's type
     *
     * TRUTH / COUNT
     */
    String type;
    
    /**
     * A comment about this variable
     *
     * Will be printed with the variable when it is defined
     */
    String comment = "";
    
    /**
     * Records the scopes that access this variable
     *
     * This is used to suggest when member variables would
     * be better off as locals, or if they aren't being used
     * at all.
     */
    HashSet<ScopeFrame> accessors = new HashSet<ScopeFrame>();
    
    /**
     * 
     * @param name The variable's name
     * @param type The variable's type
     */
    Var(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
}