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

public class StaticMethodReferences {
    public static void increasePowerOfTwo(double num){
        double result=Math.pow(num, 2);
        System.out.println(result);
    }
    public static void main(String args[]){
    
        List<Double> integerList = new ArrayList<>();
        integerList.add(new Double(5));
        integerList.add(new Double(2));
        integerList.add(new Double(6));
        integerList.add(new Double(1));
        integerList.add(new Double(8));
        integerList.add(new Double(9));
        
        integerList.forEach(StaticMethodReferences::increasePowerOfTwo);      
    
    }
}
