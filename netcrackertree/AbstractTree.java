package netcrackertree;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author TheRusskiy
 */
public class AbstractTree {
    //WHY THEY HELL IS THIS TREE CALLED ABSTRACT?!
    Node root;
    private class Node
    {
        int id;
        public Node(int id)
        {
            this.id=id;
        }
    }
    public AbstractTree(AbstractTree root)
    {
        //TODO
    }
    public AbstractTree()
    {
        root=new Node(getFreeID());
    }
    private int getFreeID()
    {
        //TODO
        return 0; //Stump - to be replaced!!!
    }
}
