/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.LinkedList;

/**
 *
 * @author Farzana
 */
public class DetectLooplinkedlist {
        class Node
        {
            int data;
            Node next;
            Node(int d) {data = d; next = null; }
        }
        public static boolean detectLoop(Node head){
                        // Add code here
                        Node curr=head;
                        Node post=head;
                        while(post!=null && post.next!=null){
                            curr=curr.next;
                            post=post.next.next;
                            if(curr==post) return true;
                        }

                return false;

            }
}