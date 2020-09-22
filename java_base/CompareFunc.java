/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_base;
import java.util.*;
/**
 *
 * @author Farzana
 */
/*
The compare() method in Java compares two class specific objects (x, y) given as parameters. It returns the value:

0: if (x==y)
-1: if (x < y)
1: if (x > y)
*/
public class CompareFunc {
    
    public static void main(String args[]){
        int a=10;
        int b=20;
        System.out.print(Integer.compare(a, b));
        
        a=110;
        b=20;
        System.out.print(Integer.compare(a, b));

        a=10;
        b=10;   
        
        System.out.print(Integer.compare(a, b));

    
    }
}
