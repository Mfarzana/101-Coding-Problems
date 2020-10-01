/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sets;

/**
 *
 * @author Farzana
 */
/*

Java hashCode()
Java Object hashCode() is a native method and returns the integer hash code value of the object. The general contract of hashCode() method is:

1. Multiple invocations of hashCode() should return the same integer value,
    unless the object property is modified that is being used in the equals() method.
2. An object hash code value can change in multiple executions of the same application.
3. If two objects are equal according to equals() method, then their hash code must be same.
4. If two objects are unequal according to equals() method, their hash code are not required to be different. Their hash code value may or may-not be equal.

*/
public class HashCode {
    public static void main(String[] args){
        String a = "200";
        String b = "200";
        
        //same hascode
        if(a.equals(b)){
            System.out.println("Equal variables:");
            System.out.println(a.hashCode() + "\n" + b.hashCode());
        }
       

        String c = "10";
        String d = "50";
        //different hascode
        if(!c.equals(d)){
            System.out.println("\nUn-equal variables:");
            System.out.println(c.hashCode() + "\n" + d.hashCode());
        }
           /* output would be different  hascode for a and b 1567 1691*/
    }
    
}
