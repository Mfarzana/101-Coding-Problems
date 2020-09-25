/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityQueue;

import java.util.*;

/**
 *
 * @author Farzana
 */
public class PriorityQuequeEx {
    public static void main(String args[]){
    
        Comparator<String> com=new Comparator<String>(){
            public int compare(String s1, String s2){
                return s1.length()-s2.length();
            }
        };
    
//        PriorityQueue pq=new PriorityQueue<>(com);

        PriorityQueue pq=new PriorityQueue(Comparator.comparing(String::length));
        pq.add("Tomy");
        pq.add("Tester anme");
        pq.add("yumade");
        pq.add("Don");
        
        System.out.println(" "+pq);
    }
    
}
