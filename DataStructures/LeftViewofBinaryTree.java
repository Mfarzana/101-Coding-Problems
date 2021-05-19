/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Farzana
 */
public class LeftViewofBinaryTree {
            class Node
            {
                int data;
                Node left, right;

                Node(int item)
                {
                    data = item;
                    left = right = null;
                }
            }

            ArrayList<Integer> leftView(Node root)
            {
                        // Your code here
                ArrayList<Integer> list=new ArrayList<>();
                Queue<Node> q= new LinkedList<>();
                if(root!=null) q.add(root);

                while(!q.isEmpty()){
                        int size=q.size();
                        boolean bval=true;
                        while(size>0){
                                Node n=q.poll();
                                if(bval) list.add(n.data);
                                if(n.left!=null) q.add(n.left);
                                if(n.right!=null) q.add(n.right);
                                bval=false;

                              size--;
                        }
                }
      
            return list;

          }
}
