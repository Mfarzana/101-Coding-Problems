/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_8;

import java.util.*;

/**
 *
 * @author Farzana
 */
/*
Java String compareTo()
The java string compareTo() method compares the given string with current string lexicographically. It returns positive number, negative number or 0.
It compares strings on the basis of Unicode value of each character in the strings.
If first string is lexicographically greater than second string, it returns positive number (difference of character value). If first string is less than second string lexicographically, it returns negative number and if first string is lexicographically equal to second string, it returns 0.

if s1 > s2, it returns positive number  
if s1 < s2, it returns negative number  
if s1 == s2, it returns 0  
*/
public class ComparatorInterface implements Comparator<Employee>{

    @Override
    public int compare(Employee t, Employee t1) {    
        return t.getName().compareTo(t1.getName());
    }
    
    public static void main(String args[]){
    
        ArrayList<Employee> ar = new ArrayList<Employee>(); 
        ar.add(new Employee(111, "bbbb", 10000.00)); 
        ar.add(new Employee(131, "xaaaa", 2000.00)); 
        ar.add(new Employee(121, "yccccop", 5699.00)); 
        
        System.out.println(ar.toString());
        
        Collections.sort(ar, new ComparatorInterface());
        System.out.println(ar.toString());
        
        
        Collections.sort(ar,new SortbyId());
        System.out.println(ar.toString());

        
        

    }
   
}
   
    class SortbyId implements Comparator<Employee>{

        @Override
        public int compare(Employee t, Employee t1) {
            return t.getId()-t1.getId();
        }

    }
