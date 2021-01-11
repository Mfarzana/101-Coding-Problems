/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Farzana
 */
/*
Input:
LinkedList: 1->2->3->4->5
Output: 3
Example 2: 

Input:
LinkedList: 2->4->6->7->5->1
Output: 7
*/
public class FindingMiddleElementLinkedList {
        class Node {
       int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }
        int getMiddle(Node head)
        {
         // Your code here.
         List<Node> list=new ArrayList<>();
         int i=0;
         while(head!=null){
             list.add(head);
             i++;
             head=head.next;
         }
         
         return list.get(i/2).data;
    }
}
