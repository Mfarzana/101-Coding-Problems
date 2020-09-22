/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101.coding.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author Farzana
 */
public class Sum_common_uncommon_element_two_array {
     public static void main(String ars[]){
         ////common 
         int arr1[]={1,2,3,4,5},arr2[]={4,5,6,7,8},sum=0;           
           for(int i: arr1){
               for(int j: arr2){
                   if(i==j)sum+=i;
               }
           }
              System.out.println(sum+" sum ");
              
              
// uncommon sum        

    List<Integer> list1  = Arrays.stream( arr1 ).boxed().collect( Collectors.toList() );
    List<Integer> list2  = Arrays.stream( arr2 ).boxed().collect( Collectors.toList() );
    list1.removeAll(list2); //list contains items only in list 1 // remove duplicate list 1

    list2.removeAll(list1); //list2 contains items only in list 2  //remove duplicate in list 2

    list2.addAll(list1); // add to list

    System.out.println( list2.toString());
    
     System.out.println(" sum "+list2.stream().collect(Collectors.summingInt(Integer::intValue)));

     }

    
}
