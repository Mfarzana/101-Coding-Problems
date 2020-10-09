/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.java_8.StreamCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Farzana
 */
public class DistinctList {
    public static void main(String args[]){
    
         List<String> list = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA");
          //distinct count
         Long l=list.stream().distinct().count();
         System.out.println(" distinct element count "+l);
         //Make list distinct to string collection
         //https://www.concretepage.com/java/jdk-8/java-8-distinct-example
         //https://www.baeldung.com/java-8-collectors
         String distString=list.stream().distinct().collect(Collectors.joining(" "));
         System.out.println(" list as string print :"+distString);
         
         List<String> disList=list.stream().distinct().collect(Collectors.toList());
         
         System.out.println(" list as listt :"+disList);

        
    }
}
