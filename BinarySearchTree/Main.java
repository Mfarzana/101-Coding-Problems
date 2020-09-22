package BinarySearchTree_BST;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Besty
 */
public class Main{
    public static void main(String args[]){
        
        //Insert BST 
        Node newNode=new Node(20);
        Tree.insertNode(newNode,5);
        Tree.insertNode(newNode, 2);
        Tree.insertNode(newNode, 1);
        Tree.insertNode(newNode, 15);        
        Tree.insertNode(newNode, 10);
        Tree.insertNode(newNode, 25);
       // Tree.insertNode(newNode, 30);
        //
        
        /* 
        
        
        Tree working 
        *Node{data=20, left=null, right=null}
        Node{data=20, left=Node{data=5, left=null, right=null}, right=null}
        Node{data=20, left=Node{data=5, left=null, right=Node{data=15, left=null, right=null}}, right=null}
        Node{data=20, left=Node{data=5, left=null, right=Node{data=15, left=null, right=null}}, right=Node{data=25, left=null, right=null}}
        Node{data=20, left=Node{data=5, left=null, right=Node{data=15, left=null, right=null}}, right=Node{data=25, left=null, right=Node{data=40, left=null, right=null}}}
        Node{data=20, left=Node{data=5, left=null, right=Node{data=15, left=null, right=null}}, right=Node{data=25, left=Node{data=25, left=null, right=null}, right=Node{data=40, left=null, right=null}}}
        */

        //BST TRaversal // root Left right
        Tree.preorderTraversal(newNode);        
        
        
       int val= Tree.getLongestPath(newNode);
       System.out.println(" longest path = "+val);
        
       
        
       
       // maximum sum leaf to root path in a Binary Tree  
       int maximumSum= Tree.getMaximumSum(newNode);
       System.out.println(" Maximum sum = "+maximumSum);
       
       // maximum PATH  sum leaf to root path in a Binary Tree 
       
       

       int longestPathSumRootToLeaf= Tree.LongestPathSumRootToLeaf(newNode);
       System.out.println(" Longest path sum = "+longestPathSumRootToLeaf);
       boolean b=Tree.printPath(newNode, longestPathSumRootToLeaf);
       //Print leaf Node
       //Tree.printLeafNode(newNode);

       System.out.print("  ....................  ");
      //##############           DFS          #######################
       BFSAndDFS bFSAndDFS=new BFSAndDFS();      
       bFSAndDFS.DFS(newNode);//DFS Using  preorder traversal
      
       System.out.println("\nDFS Using Stack");
       Stack stack=new Stack();
       stack.push(newNode);
       bFSAndDFS.DFSstack(stack);       
       //##############           BFS          #######################
       System.out.println("\nBFS  Using Stack");
       Queue queue=new LinkedList();
       queue.add(newNode);
       bFSAndDFS.BFSqueue(queue);
       
       int min=MinMaxBST.getMinValue(newNode);
       System.out.print(" min value "+min);
       int max=MinMaxBST.getMax(newNode);
       System.out.print(" max value "+max);

}

}

