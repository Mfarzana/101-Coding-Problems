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
public class PriorityQueueEx {
    /* 
    Java PriorityQueue class is a queue data structure implementation in which objects are processed based on their priority.
    added objects are according to their priority.
    By default, the priority is determined by objects’ natural ordering
    */
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add (20);
        pq.add (10);
        pq.add (11);
        pq.add (5);    
        System.out.println(pq);//the natural ordering
    }
    
}
