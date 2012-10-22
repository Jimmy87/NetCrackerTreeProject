/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackertree;


/**
 *
 * @author TheRusskiy
 */

/**
 * 
 * @author TheRusskiy
 */
public class IDGenerator {
    ID currentID;    
    
    
    /**
     * Creates new IDGenerator with "fresh" ID
     */
    public IDGenerator(){
        currentID=new ID();
    }
    
    
    /**
     * @return next ID
     */
    ID nextID(){
        currentID=currentID.nextValue();
        return currentID;
    }   
    
    /**
     * @return look at what ID this generator points
     */
    ID currentID(){
        return currentID;
    }
}
