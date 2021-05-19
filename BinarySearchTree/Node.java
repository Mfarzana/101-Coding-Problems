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

public class Node {
    int data;
    private Node left;
    private Node right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    
    public Node(int data) {
        this.data = data;
        left=null;
        right=null;
    }

   

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", left=" + left + ", right=" + right + '}';
    }
    
    
}
