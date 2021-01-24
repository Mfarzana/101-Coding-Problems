/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.BinarySearchTree;

/**
 *
 * @author Besty
 */
public class IsBinaryTree {
    
            class Node{
                        int data;
                        Node left;
                        Node right;
                        Node(int data){
                            this.data = data;
                            left=null;
                            right=null;
                        }
    
                boolean isBST(Node root)
                    {
                        // code here.
                        if(root==null) return true;
                        return dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

                    }

                boolean dfs(Node root, Integer min, Integer max){

                    if(root==null) return true;
                    if(root.data<=min || root.data>=max) return false; 

                    return dfs(root.left, min, root.data) && dfs(root.right, root.data, max);
                }   
    
        }
}
