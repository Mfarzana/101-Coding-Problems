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
public class Find_Nth_nodeFromEndLinkedList {
    
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

  /* Input    N = 2
LinkedList: 1->2->3->4->5->6->7->8->9
Output: 8
    */
    /*
    Input:N = 5
LinkedList: 10->5->100->5
Output: -1
    */
    int getNthFromLast(Node head, int n)
    {
        
        List<Node> list=new ArrayList<>();
        
        while(head!=null){
            list.add(head);
            head=head.next;
        }
        if(list.size()<n)
            return -1;
        else
            return list.get(list.size()-n).data;
    	// Your code here	
    }
}

