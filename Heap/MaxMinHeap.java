/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heap;
import java.util.*;
/**
 *
 * @author Farzana
 */
public class MaxMinHeap {
    public static void maxHeapPQ(PriorityQueue pq){
        pq.add (20);
        pq.add (10);
        pq.add (11);
        pq.add (5);    
        System.out.println("Max Heap "+pq);//priority by a Comparator provided at queue construction time,
        // Printing the top element of PriorityQueue 
        System.out.println("head "+pq.peek());   
        // removing top element 
        System.out.println("romove head "+pq.poll());   
        // Printing the top element again 
        System.out.println("head "+pq.peek());   
        
        System.out.print("Value in Queue:  ");
        for(Object i:pq){
         System.out.print(i+" ");
        }
    }
    public static void minHeapPQ(PriorityQueue pq){
        pq.add (20);
        pq.add (10);
        pq.add (11);
        pq.add (5);    
        System.out.println("Min Heap "+pq);//the natural ordering
        // Printing the top element of PriorityQueue 
        System.out.println("head "+pq.peek());   
        // removing top element 
        System.out.println("romove head "+pq.poll());   
        // Printing the top element again 
        System.out.println("head "+pq.peek());   
    }
    public static void main(String ar[]){       
        PriorityQueue<Integer> pq1=new PriorityQueue<>(); 
        minHeapPQ(pq1);
        
       PriorityQueue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder());        
        maxHeapPQ(pq2);
    }
}
