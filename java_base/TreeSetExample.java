/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.java_base;

import java.util.TreeSet;

/**
 *
 * @author Farzana
 */
/*

TreeSet is one of the most important implementations of the SortedSet interface in Java that uses a Tree for storage.
The ordering of the elements is maintained by a set using their natural ordering whether or not an explicit comparator is provided.
## cannot get value by index by direct method. you have conver treeset to array/arraylist

####The important points about Java TreeSet class are:####
Java TreeSet class contains unique elements only like HashSet.
Java TreeSet class access and retrieval times are quiet fast.
Java TreeSet class doesn't allow null element.
Java TreeSet class is non synchronized.
Java TreeSet class maintains ascending order.

## Uses
TreeSet uses Red-Black tree underlying. So the set could be thought as a dynamic search tree. 
When you need a structure which is operated read/write frequently and also should keep order, the TreeSet is a good choice.

## Complexity
1. Operations which work on a single element are all O(ln n) comparisons except first and last which are O(1) 
comparisons or O(ln N) node search time.

2. comparator(), iterator(), clear(), first(), isEMpty(), size(), last(), pollFirst(), pollLast() are O(1)

3. add(), ceiling(), contains(), floor(), headSet(), higher(), lower(), remove(), subSet(), tailSet() are O(ln N)

4. clone(), equals(), hashCode(), toArray() and toString() are O(n)
*/
public class TreeSetExample {
    public static void main(String args[]){
        TreeSet<String> strset=new TreeSet<String>();
        TreeSet<Integer> numset=new TreeSet<Integer>();
        
        strset.add("Heno");
        strset.add("beloe");
        strset.add("Calan");
        
        numset.add(19);
        numset.add(2);
        numset.add(11);
        numset.add(51);
        numset.add(17);
        numset.add(10);
        
        
        System.out.println(strset);
        System.out.println(numset);
        
         System.out.println("Reverse Set: "+strset.descendingSet());  
           
         System.out.println("Head Set: "+strset.headSet("Calan", true));  
          
         System.out.println("SubSet: "+numset.subSet(1, false,20, true));  
           

    }
}
