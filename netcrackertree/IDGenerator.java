/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackertree;

/**
 *
 * @author TheRusskiy
 */
public class IDGenerator {
    ID currentID;
    ID nextID(){
        currentID=currentID.nextValue();
        return currentID;
    }   
    ID currentID(){
        return currentID;
    }
}
