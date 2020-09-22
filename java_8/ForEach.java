/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Farzana
 */
/*
         Examples of forEach()
*/
public class ForEach {
    public static void main(String args[]){
        List<String> alphabets = new ArrayList<>(Arrays.asList("aa", "bbb", "cat", "dog"));
        //Example 1
        alphabets.forEach(s->System.out.print(s+" "));
        //Example 2
        alphabets.forEach(System.out::println);
        //Example 3  filter and forEach() Example
        alphabets.stream().filter(s->s.startsWith("a")).forEach(System.out::println);
        //Example 4 with map()
        alphabets.stream().map(s->s.length()).forEach(System.out::println);
        //or 
        alphabets.stream().map(s->s.length()).forEach(x->System.out.print(" "+x+" len"));

        


        
    
    }
}
