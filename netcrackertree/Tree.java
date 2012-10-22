/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackertree;

import java.io.File;
import java.util.Iterator;

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
    
    //TODO
    //ADD EXCEPTIONS!!!
    
    /**
     * @return Iterator of encapsulated children list
     */
    Iterator<Tree> getChildrenIterator();
    
    
    /**
     * @return array of children
     */
    Tree[] getChildren();
    
    
    /**
     * @param data set data to this value
     */
    void setData(Data data);
    
    
    /**
     * @return data that this tree contains
     */
    Data getData();
    
    
    /**
     * Adds new Tree to the one with specified id.
     * Switches isSorted to "false".
     * Checks if new Tree has the same IDGenerator,
     * if false, then change all IDs of a new tree according
     * to current IDGenerator.
     * @param id ID of a Node to which you want to attach new Tree
     */
    void add(ID id, Tree tree);
    
    
     /**
     * Adds new Tree, to the children of current tree.
     * Switches isSorted to "false".
     * Checks if new Tree has the same IDGenerator,
     * if false, then change all IDs of a new tree according
     * to current IDGenerator.
     */
    void add(Tree tree);
    
    
    /**
     * Append to parent's list of Tree children
     * and delete all links that lead to itself
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
