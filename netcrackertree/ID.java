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
    long value;
    public ID()
    {
        value=0;
    }
    private ID(long value)
    {
        this.value=value;
    }
    long getValue()
    {
        return value;
    }
    boolean equals(ID id)
    {
        return (this.getValue()==id.getValue());
    }
    ID nextValue()
    {
        return new ID(value+1);
    }
}
