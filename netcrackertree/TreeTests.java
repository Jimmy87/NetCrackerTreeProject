package netcrackertree;

import java.util.Iterator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author TheRusskiy
 */


public class TreeTests {
    public static boolean testAll()
    {
        //TODO
        if (!createTree()) return false;
        if (!noCircles()) return false;
        if (!addNode()) return false;
        if (!cannotAddTwice()) return false;
        if (!splitTree()) return false;
        if (!cloneTree()) return false;
        if (!nodeSearch()) return false;
        if (!orderTree()) return false;
        if (!saveTree()) return false;
        if (!loadTree()) return false;
        if (!multipleTree()) return false;
        if (!copyAndInsertTree()) return false;
        return true;
    }
    public static boolean createTree()
    {
        IDGenerator generator = new IDGenerator();
        CrackerTree tree = new CrackerTree(generator);
        return (tree!=null);
    }
    
    public static boolean noCircles()
    {
        IDGenerator generator = new IDGenerator();
        CrackerTree tree = new CrackerTree(generator);
        try
        {
            tree.add(tree);
        }
        //TODO
        //not "just" exception, specific one
        catch(Exception e)
        {
            return true;
        }
        return false;
    }
    
    public static boolean addNode()
    {
        IDGenerator generator = new IDGenerator();
        CrackerTree tree = new CrackerTree(generator);
        CrackerTree tree1 = new CrackerTree(generator);
        CrackerTree tree2 = new CrackerTree(generator);
        CrackerTree tree3 = new CrackerTree(generator);
        tree.add(tree1);
        tree.add(tree2);
        tree2.add(tree3);  
        Tree temp;
        Iterator<Tree> trit=tree.getChildrenIterator();
        while (trit.hasNext())
        {
            temp=trit.next();
            if (temp==tree2) return true;
        }            
        return false;
    }
    
    
    public static boolean cannotAddTwice()
    {
        IDGenerator generator = new IDGenerator();
        CrackerTree tree = new CrackerTree(generator);
        CrackerTree child = new CrackerTree(generator);
        try
        {
            tree.add(child);
            tree.add(child);
        }
        //TODO
        //not "just" exception, specific one
        catch(Exception e)
        {
            return true;
        }
        return false;
    }
    
    public static boolean splitTree()
    {
        IDGenerator generator = new IDGenerator();
        CrackerTree tree = new CrackerTree(generator);
        CrackerTree parent = new CrackerTree(generator);
        CrackerTree child1 = new CrackerTree(generator);
        CrackerTree child2 = new CrackerTree(generator);
        parent.add(tree);
        tree.add(child1);
        tree.add(child2);
        tree.split();
        Tree temp;
        Iterator<Tree> trit=parent.getChildrenIterator();
        while (trit.hasNext())
        {
            temp=trit.next();
            if (temp==tree) return false;
            if (temp!=child1&&temp!=child2) return false;
        }            
        return true;
    }

    public static boolean cloneTree() {
        //TODO
        IDGenerator generator = new IDGenerator();
        Tree tree1 = new CrackerTree(generator);
        Tree child1 = new CrackerTree(generator);
        tree1.add(child1);
        Tree child2 = new CrackerTree(generator);
        tree1.add(child2);
        Tree tree2;
        tree2=tree1.clone();
        if (tree1.getData()==tree2.getData()) return false;
        Tree[] trit1=tree1.getChildren();
        Tree[] trit2=tree2.getChildren();
        if (trit1.length!=trit2.length) return false;
        for(int i=0; i<trit1.length; i++)
        {
            if (trit1[i]==trit2[i]) return false;
            if (trit1[i].getData()==trit2[i].getData()) return false;
            if (!trit1[i].getData().equals(trit2[i].getData())) return false;
            //Test IDs???
        }
        return true;
    }

    public static boolean nodeSearch() {
        //TODO
        return false;
    }

    public static boolean orderTree() {
        //TODO
        return false;
    }

    public static boolean saveTree() {
        //TODO
        return false;
    }

    public static boolean loadTree() {
        //TODO
        return false;
    }

    public static boolean multipleTree() {
        //TODO
        return false;
    }

    public static boolean copyAndInsertTree() {
        //TODO
        return false;
    }
    
    
}







