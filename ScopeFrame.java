import java.util.LinkedHashMap;
import java.util.ArrayList;

/**
 * Holds a frame in the scope for a piece of code
 *
 * In theory, you can have as many frame levels as you want,
 * but in LittleNic they are used as follows:
 *
 * globals [Only one. No parent]
 *    |
 * params [One per method. Parent = globals]
 *    |
 * locals [One per method. Parent = a param scope]
 *
 * parameters are in a different scope frame to locals because
 * "local variables can shadow formal parameters"
 *
 * ...the amount of sense that requirement makes is elephant
 */
public class ScopeFrame
{
    /**
     * This frame's parent
     */
    ScopeFrame parent;
    
    /**
     * The variables defined in this frame
     */
    LinkedHashMap<String, Var> vars = new LinkedHashMap<String, Var>();
    
    /**
     * 
     * @param parent The parent frame for this
     */
    ScopeFrame(ScopeFrame parent)
    {
        this.parent = parent;
    }
    
    /**
     * Attempts to find an id
     *
     * If it's not defined in this frame, it'll go up
     * checking each parent until it reaches the global frame
     *
     * @param id The id to search for
     * @return   The Var, if found
     */
    Var get(String id)
    {
        ScopeFrame check = this;
        
        //Basically a recursive call but without the recursion
        while (check != null)
        {
            if (check.vars.containsKey(id))
            {
                Var v = check.vars.get(id);
                
                v.accessors.add(this);
                
                return v;
            }
            else
            {
                check = check.parent;
            }
        }

        return null;
    }
    
    /**
     * Returns the length of the longest variable name
     * defined in this frame
     *
     * @return The length
     */
    int getLongestVar()
    {
        int longest = 0;
        
        for (Var v : new ArrayList<Var>(vars.values()))
        {
            if (v.name.length() > longest)
            {
                longest = v.name.length();
            }
        }
        
        return longest;
    }
}	