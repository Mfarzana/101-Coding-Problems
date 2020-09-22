/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree_BST;

/**
 *
 * @author Besty
 */
public class MinMaxBST {
    
    //Acutal Binary Tree
    public static int getMinValue(Node node){
        if(node.getLeft()==null) 
              return node.getData();
        else 
            return getMinValue(node.getLeft());
    }
    public static int getMax(Node node){
        if(node.getRight()==null)
            return node.getData();
        else 
            return getMax(node.getRight());
    }
    
}
