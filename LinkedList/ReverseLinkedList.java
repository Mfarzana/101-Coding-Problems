/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.LinkedList;

import java.util.ArrayList;
import java.util.List;
/*
Input:
LinkedList: 1->2->3->4->5->6
Output: 6 5 4 3 2 1
Explanation: After reversing the list, 
elements are 6->5->4->3->2->1.
*/
/**
 *
 * @author Farzana
 */
public class ReverseLinkedList {
    class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

Node reverseList(Node head)
    {
        List<Node> list=new ArrayList<>();
        while(head!=null){
            list.add(head);
            head=head.next;
        }
        
        for(int i=list.size()-1; i>0;i--){
           list.get(i).next=list.get(i-1);
        }
        list.get(0).next=null;
        
        return list.get(list.size()-1);
        // code here
    }
}

