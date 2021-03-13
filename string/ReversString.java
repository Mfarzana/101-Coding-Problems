/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.string;

/**
 *
 * @author Farzana
 */
public class ReversString {
    public static String getReverseString(String str){
    return new StringBuilder(str).reverse().toString();
    }
    
     public  static void main (String args[]){  
         System.out.println("reverseString(hello)  "+getReverseString("hello"));
         System.out.println("reverseString(java)  "+getReverseString("java"));

    }
}
