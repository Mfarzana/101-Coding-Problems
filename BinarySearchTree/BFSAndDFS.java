/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree_BST;

import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Besty
 */
public class BFSAndDFS {
    
      /* Breadth first is a queue, depth first is a stack.
        For breadth first, add all children to the queue, then pull the head and do a breadth first search on it, using the same queue.
        For depth first, add all children to the stack, then pop and do a depth first on that node, using the same stack
    */
    public static void BFSqueue(Queue queue){
        if(queue.isEmpty()) return;
        Node node=(Node) queue.poll();
        System.out.println("Queue poll  "+node.getData());        

        if(node.getLeft()!=null) queue.add(node.getLeft());
        if(node.getRight()!=null) queue.add(node.getRight());
        
        BFSqueue(queue);
       
    }
    
    
    public static void DFSstack(Stack stack){
        if(stack.empty())return;
        
        Node node=(Node) stack.pop();
        System.out.println("stack pop  "+node.getData());        
        if(node.getLeft()!=null) stack.push(node.getLeft());
        if(node.getRight()!=null) stack.push(node.getRight());
        
        DFSstack(stack);    
    }
    
    // DFS can be done with preoder , postoder or inorder ,
    // its just complete oneside fully then go to other side
    /*
          5
         / \
        3   6
       / \     
      2   4 
    Depth First Traversals:
    (a) Inorder (Left, Root, Right) :2 3 4 5 6
    (b) Preorder (Root, Left, Right) : 5 3 2 4 6
    (c) Postorder (Left, Right, Root) : 2 4 3 6 5
    */
  
    public static void  DFS(Node node){        
        if(node!=null){           
           System.out.print("  "+node.getData()+" ");
            DFS(node.getLeft());
            DFS(node.getRight()); 
        }            
            
    }
}
