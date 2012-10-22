/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackertree;

/**
 *
 * @author TheRusskiy
 */



public class ID {
    /**
     * value that defines "identity" of this ID
     */
    private long value;
    
    
    /**
     * Create new ID
     */
    public ID()
    {
        value=0;
    }
    
    
    /**
     * Create new ID with specified identity
     * @param value parameter of type Long
     */
    private ID(long value)
    {
        this.value=value;
    }
    
    
    /**
     * @return value that represents identity
     */
    private long getValue()
    {
        return value;
    }
    
    
    /**
     * @param id ID with which current ID should be compared
     * @return true if IDs are equal
     */
    public boolean equals(ID id)
    {
        return (this.getValue()==id.getValue());
    }
    
    
    /**
     * @return new unique ID that follows this one
     */
    public ID nextValue()
    {
        return new ID(value+1);
    }
}
