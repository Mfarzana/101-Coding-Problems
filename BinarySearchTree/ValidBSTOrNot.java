/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author Farzana
 */
public class ValidBSTOrNot {
    
    class  Node{
        int data;
        Node left;
        Node right;

        Node(int value){
        data=value;
        left=right=null;
       }
     
    }  
   /* returns true if given search tree is binary
     search tree (efficient version) */
    
     public boolean isValidBST(Node root) {       
        return  isValidUtill(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public boolean isValidUtill(Node root, int min, int max){
         if(root==null)
            return true;
       if(root.data<min || root.data>max) return false;
        
        return isValidUtill(root.right,Integer.MIN_VALUE, Integer.MAX_VALUE) && isValidUtill(root.left,Integer.MIN_VALUE, Integer.MAX_VALUE);
        
    }
    
    
}
