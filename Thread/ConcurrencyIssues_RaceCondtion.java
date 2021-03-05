/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Farzana
 */


/*
        ## output:        
         Instead of producing the final count of 1000, it gives inconsistent result each time it is run.. the output was 992, 996 and 993.     
        ## Race condition.
        When multiple threads try to read and write a shared variable concurrently, 
        and these read and write operations overlap in execution,
        then the final outcome depends on the order in which the reads and writes take place, which is unpredictable. 
        This phenomenon is called Race condition.
        */
public class ConcurrencyIssues_RaceCondtion {
    
    public static void main(String[] args) throws InterruptedException {
        //Creates a thread pool that reuses a fixed number of threads operating off a shared unbounded queue.
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        
        
        Counter counter = new Counter();

        for(int i = 0; i < 1000; i++) {
            executorService.submit(() -> counter.increment());
        }
          System.out.println(executorService.toString());

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);
    
        System.out.println("Final count is : " + counter.getCount());
        
        

    }
}

class Counter {
    int count = 0;

    public void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}

/*


*/