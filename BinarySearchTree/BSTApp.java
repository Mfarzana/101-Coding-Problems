/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BST;


/**
 *
 * @author Besty
 */

//Binary Search Tree Insertion
//input values={8,3,6,10,4,7,1,14,13}
public class BSTApp {
    
     public static void main(String[] args) {
        // TODO code application logic here
        BST b = new BST();
        Node root=null;
        root=b.insert(root,8);
        
        
    }
}
class Node{
        int data;
        Node left;
        Node right;
    }
    // all methods for Binary Search 
class BST{
     public Node createNewNode(int val){
         Node n=new Node();
         n.data=val;
         n.left=null;
         n.right=null;
         return n;
     }
       public Node insert(Node node, int val){
        if(node==null){
            createNewNode(val);
        }
       
       return node;
    }  
}
