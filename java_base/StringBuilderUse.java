/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.java_base;

/**
 *
 * @author Farzana
 */
/*
##Java StringBuilder class is used to create mutable (modifiable) string##
String Bulider Constructor:	
1. StringBuilder()  ##creates an empty string Builder with the initial capacity of 16.
2. StringBuilder(String str) ##creates a string Builder with the specified string.
3. StringBuilder(int length) ##creates an empty string Builder with the specified capacity as length.
ref: javatpoint.com/StringBuilder-class
*/
public class StringBuilderUse {
    
    public  static void main (String args[]){
    
        //Apend String
        StringBuilder builder=new StringBuilder("Hello");
        System.out.println(" "+builder.append("Java"));
        
        // String reverse
        builder=new StringBuilder("Hello");
         System.out.println("builder.reverse(Hello)) "+builder.reverse());

    }
}
