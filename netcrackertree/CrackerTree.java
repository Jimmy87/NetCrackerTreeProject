/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackertree;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author TheRusskiy
 */
public class CrackerTree implements Tree{
    private IDGenerator idGenerator;
    private ID id;
    private Data data;
    private boolean isSorted; // for search optimization
    private List<Tree> children = new LinkedList();    
    private Tree parent;

    //???PUBLIC
    public Tree getParent() {
        return parent;
    }

    
    public CrackerTree(IDGenerator generator)
    {
        //TODO Implement
    }
    
    @Override
    public Iterator<Tree> getChildrenIterator() {
        return children.iterator();
    }
    
    @Override
    public Tree[] getChildren() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void setData(Data data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Data getData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void add(ID id, Tree tree) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void add(Tree tree) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void split() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Tree find(ID id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Tree find(Data data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void saveTo(File path) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Tree loadFrom(File path) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    //???Clone IDs
    @Override
    public Tree clone() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Tree copy(ID id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    
}
