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
public class SingletonClassMethod1 {
    public static SingletonClassMethod1 INSTANCE;
    /*private SingletonClass(){
    }*/
    public synchronized static SingletonClassMethod1 getInstance(){
        if(INSTANCE==null){
            INSTANCE=new SingletonClassMethod1();
            System.out.println(" New Object created ");
        }
        else 
            System.out.println(" Instace already exits....");
        
        return INSTANCE;
    }
    public void message(String str){
    		System.out.println("Message function called "+str);

    }
}
