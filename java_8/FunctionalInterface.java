/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_8;

/**
 *
 * @author Farzana
 */
/*
Fuctional Interface Only have 1 abastract method
*/
interface MathOperation {
    public int operation(int a, int b);//functional interface
}
public class FunctionalInterface{
    public static void main(String args[]){
    
        MathOperation mathOP=(a,b)->a+b;
        
        int val=mathOP.operation(10, 10);
        System.out.print(val);
    }

}
