/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree_BST;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author Besty
 */
class Tree {
    
    public static Node insertNode(Node root,int value){
        if(root==null){         
            return new Node(value);
        }
        // when value is greater than root node
        if(root.getData()<value){            
            root.setRight(insertNode(root.getRight(),value));            
        }
        else root.setLeft(insertNode(root.getLeft(), value)); // value is less than root node        

        return root;
    }
    //Traversal from root left then right
    public static void preorderTraversal(Node node){    
        if(node!=null) {
            System.out.print(" "+node.getData()+" ");
            preorderTraversal(node.getLeft());
            preorderTraversal(node.getRight());
        }       
        
    }
    
    //Longest Path
   /* The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two end nodes.*/
     /*   5
         / \
        3   6
       / \     
      2   4    
    Return 3, which is the length of the path [2,3,5,6] or [4,3,5,6].    
    a path between any two leaf nodes is the longest.”  */
    
    //**************longest start *****************/
    public static int getLongestPath(Node node){
        if(node==null)
            return 0;
        
        else if(node.getLeft()==null && node.getRight()!=null)
           return calculatePath(node.getRight(), 1); // calculate right side node of the tree when there is no left node present
        
        else if(node.getLeft()!=null && node.getRight()==null)
           return calculatePath(node.getLeft(), 1);// calculate left side of the tree when there is no; right node present 
        
        else
           return calculatePath(node.getLeft(),1)+calculatePath(node.getRight(), 1); // calculate both side node and return some the node level
        
    }
    public static int calculatePath(Node node,int level){        
        if(node.getLeft()==null && node.getRight()==null)
            return level;

        else if(node.getLeft()==null && node.getRight()!=null)
            return calculatePath(node.getRight(), level+1); 

         else if(node.getLeft()!=null && node.getRight()==null)
            return calculatePath(node.getLeft(), level+1);

         else{
            int left=calculatePath(node.getLeft(),level+1);
            int right=calculatePath(node.getRight(), level+1);
            return left>right?left:right;        
        }
        
        

    } 
   /**************** longest end ******************************/ 
    
    /* Hight of a Binary tree or Depth of a binary tree
    Maximum Depth=1+ Number of edges on the longest path from root to leaf
    */
    public static int getHight(Node node){
        if(node==null)
            return 0;
        
        int left=getHight(node.getLeft()); 
        int right=getHight(node.getRight());
        
        if(left>right)
            return 1+left;
        else return 1+right;
    }
    
    
   //Find the maximum sum leaf to root path in a Binary Tree
     /*   5
         / \
        3   6
       / \     
      2   4    
    
    2>3>5=10, 4>3>5=12 5>6=11  so maximum of them is 12 so path is 4>3>12
    */
    
    public static int getMaximumSum(Node node){
        if(node==null)
            return 0;
       
        int left=node.getData()+getMaximumSum(node.getLeft());
        int right=node.getData()+getMaximumSum(node.getRight());
        
       // System.out.println("left= "+left);
       // System.out.println("right= "+right);

        return left>right?left:right;       
    }
    
    //Print Leaf Node 
    public static void  printLeafNode(Node node){  
        Stack<Integer> stack=getLeafNode(node,new Stack<Integer>());
        System.out.print(stack);
    }
    public static Stack<Integer> getLeafNode(Node node,Stack<Integer> stack){
         if(node.getLeft()==null && node.getRight()==null){
           stack.add(node.getData());
        } 
        if(node.getLeft()!=null) getLeafNode(node.getLeft(),stack);        
        if(node.getRight()!=null) getLeafNode(node.getRight(),stack);
        
        return stack;
    }
    // end Print leaf Node
}
 
