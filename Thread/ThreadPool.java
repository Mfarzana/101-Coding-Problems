/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Farzana
 */
/*
##  Thread Pool
Java Thread pool represents a group of worker threads that are waiting for the job and reuse many times.
In case of thread pool, a group of fixed size threads are created. 
A thread from the thread pool is pulled out and assigned a job by the service provider.

Advantage of Java Thread Pool
Better performance It saves time because there is no need to create new thread.

## Real time usage
It is used in Servlet and JSP where container creates a thread pool to process the request.
*/
public class ThreadPool {
        public static void main(String[] args) {  
               ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
               for (int i = 0; i < 10; i++) {  
                   Runnable worker = new WorkerThread(" "+i);  
                   executor.execute(worker);//calling execute method of ExecutorService  
                 }  
               executor.shutdown();  
               while (!executor.isTerminated()) {   }  

               System.out.println("Finished all threads");  
           }  
 }  
class  WorkerThread implements  Runnable{
    private String  s;
    WorkerThread(String s){
        this.s=s;
    }
     public void run() {  
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+s);  
        processmessage();//call processmessage method that sleeps the thread for 2 seconds  
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
    }  
    private void processmessage() {  
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
    }  
}