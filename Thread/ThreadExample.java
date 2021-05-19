package _101_Coding_Problems.Thread;



import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Farzana
 */
public class ThreadExample {
    
    public static void main (String args[] ){
        // Extend Thread class
        Thread1 t1=new Thread1();
        
        // Runnable interface
        
         Thread2 t2=new Thread2();
         Thread t2new=new Thread(t2);

         t1.start();
        try {
            t1.join(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2new.start();
    }
}
class Thread1 extends Thread{

    
        public void run(){
          for(int i=0; i<10; i++){
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException ex) {
                  Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
              }
            System.out.println(Thread.currentThread().getName()+"   "+Thread.currentThread().toString());
        
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 
        }
}
class Thread2 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(Thread.currentThread().getName()+"   "+Thread.currentThread().toString());
        
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}