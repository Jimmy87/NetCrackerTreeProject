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
    
    
    /**
     * Adds new Tree, switches @isSorted to "false"
     * @param id ID of a Node to which you want to attach new Tree
     */
    void add(ID id, Tree tree);
    
    
    /**
     * Append to parent's list of Tree children of self
     * and deletes all links which lead to itself
     */
    void split(); 
    
    
    /**
     * @param id
     * @return Tree with specified ID
     * if tree is sorted then apply different search algorithm 
     */
    Tree find(ID id);
    
    
    /**
     * @param data
     * @return Tree with specified Data
     * if tree is sorted then apply different search algorithm 
     */
    Tree find(Data data);
    
    
    /**
     * @param path where to save current tree
     */
    void saveTo(File path);
    
    
    /**
     * @param path
     * @return Tree from the specified path
     */
    Tree loadFrom(File path);
    
    
    /**
     * @return clone of self
     */
    Tree clone();
    
    
    /**
     * @param id ID of a Tree, that can be found inside this Tree
     * @return deep copy of a Tree with specified ID
     */
    Tree copy(ID id);
    
    
    /**
     * sorts Tree, so that children ID always bigger than one parent has
     * switches isSorted to "true"
     */
    void sort();
}
