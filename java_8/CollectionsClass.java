/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_8;
import java.util.Collections;
import java.util.ArrayList;
/**
 *
 * @author Farzana
 */
/*

java.util.Collections.sort() method is present in java.util.Collections class. It is used to sort the elements present in the specified list of Collection in ascending order.
It works similar to java.util.Arrays.sort() method but it is better then as it can sort the elements of Array as well as linked list, queue and many more present in it.
*/
public class CollectionsClass {
    public static void main(String[] args) 
    { 
        // Create a list of strings 
        ArrayList<String> al = new ArrayList<String>(); 
        al.add("Geeks For Geeks"); 
        al.add("Friends"); 
        al.add("Dear"); 
        al.add("Is"); 
        al.add("Superb"); 
        al.add(0,"df");
  
        /* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        Collections.sort(al); 
        System.out.println(al);
        
        //decending order
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
  
        // also We can use Comparator Interface for this purpose.
    } 
}
