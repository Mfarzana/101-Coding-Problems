/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_base;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Farzana
 */
 //Java Thread Example by implementing Runnable interface
class Thread1 implements Runnable{
    @Override
    public void run() {
       System.out.println(" First thread processs..........");
       for(int i = 5; i > 0; i--) {
        System.out.println("Thread 1: " + i);
           try {
               Thread.sleep(1000); //Causes the currently running thread to block for at least the specified number of milliseconds.
           } catch (InterruptedException ex) {
               Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
    
}
//Java Thread Example by extending Thread class
class Thread2 extends Thread{
    public void run(){
           System.out.println(" Second thread processs*******");
           for(int i = 5; i > 0; i--) {
            System.out.println("Thread2 : " + i);
               try {
                   Thread.sleep(1000); //Causes the currently running thread to block for at least the specified number of milliseconds.
               } catch (InterruptedException ex) {
                   Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
               }
           }

    }
}

public class ThreadExample_1{    
    
    public static void main(String args[]) throws InterruptedException{
    
// Thread 1
    Thread1 ex1=new Thread1();
    Thread t1=new Thread(ex1);
    System.out.println("Name of thread="+t1.getName());
    t1.start();

    
  //
    Thread2 th2=new Thread2();
    th2.start();    
    System.out.println("Name of thread ="+th2.getName());
    
    
    // Thread.sleep(10000);//Causes the currently running thread to block for at least the specified number of milliseconds.



    }
    
}
