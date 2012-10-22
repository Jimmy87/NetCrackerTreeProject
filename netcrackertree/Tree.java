/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackertree;

import java.io.File;

/**
 *
 * @author TheRusskiy
 */
public interface Tree{
    //IDGenerator idGenerator;
    //ID id;
    //Data data;
    //boolean isSorted; // for search optimization
    //List<Tree> children    
    //Tree parent
    void add(ID id, Tree tree);
    void split(); 
    Tree find(ID id);
    Tree find(Data data);
    void saveTo(File path);
    Tree loadFrom(File path);
    Tree clone();
    Tree copy(ID id);
    void sort();
}
