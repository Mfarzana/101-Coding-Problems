/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author Farzana
 * 
input
{}()
({()})
{}(
[]
Sample Output

true
true
false
true
W*/
public class ReplaceString {
    public static boolean isTrue(String s){
        System.out.println(s.replaceAll("", s));
            
     return false;
    }
    public static void main (String args[]){
        isTrue("{}()");
        isTrue("({()})");
        isTrue("{}(");
        isTrue("[]");
    
    }
}
