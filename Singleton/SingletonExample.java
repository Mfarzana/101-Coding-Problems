/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Farzana
 */
public class SingletonExample {
    public static void main(String args[]){
        SingletonClassMethod1 obj=SingletonClassMethod1.getInstance();
       SingletonClassMethod1 obj2=SingletonClassMethod1.getInstance();

        obj.message(" testing oject 1");
        obj2.message(" testing oject 2");

        System.out.println();

        
    }
}
