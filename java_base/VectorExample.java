/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.java_base;

import java.util.Vector;

/**
 *
 * @author Farzana
 */
/*
#Vector is like the dynamic array which can grow or shrink its size and no size limit.
It is recommended to use the Vector class in the thread-safe implementation only. 
If you don't need to use the thread-safe implementation, you should use the ArrayList, the ArrayList will perform better in such case.

##It is similar to the ArrayList, but with two differences-
Vector is synchronized.
Java Vector contains many legacy methods that are not the part of a collections framework.

#synchronized keyword does is that it prevents more than one thread from executing the method at the same time"

#Vector is considered 'thread-safe' because access the the internals of the Vector is synchronized.
Methods such as add(), get(), size(), etc, are all synchronized such that modifications to the internal structure of the Vector and 
access to that internal structure cannot be processed simultaneously by separate threads.

#The only two legacy collections are thread-safe: Vector and Hashtable. WHY?
https://www.codejava.net/java-core/collections/understanding-collections-and-thread-safety-in-java
https://levelup.gitconnected.com/how-to-use-java-collections-safely-in-multi-threaded-environments-83c94be57ab8
Arraylis vs Vector
https://beginnersbook.com/2013/12/difference-between-arraylist-and-vector-in-java/
#  new collections (List, Set, Map, etc) provide no concurrency control at all to provide maximum performance in single-threaded applications.

When to use ArrayList and when to use vector?
1. It totally depends on the requirement. If there is a need to perform “thread-safe” operation the vector is your best bet as it ensures that only one thread access the collection at a time.
2. Performance: Synchronized operations consumes more time compared to non-synchronized ones 
so if there is no need for thread safe operation, ArrayList is a better choice as performance will be improved because of the concurrent processes.
*/
public class VectorExample {
    
     public  static void main (String args[]){
    
        Vector<Integer> vector=new Vector<Integer>();
        vector.add(10);
        vector.add(11);
         vector.add(11);
        vector.add(12);
         System.out.println(vector+" "+vector.size());

        vector.add(14);
        vector.add(18);
        vector.add(120);
        vector.add(103);
         
         System.out.println(vector+" "+vector.size());

          System.out.println(" Element first = "+vector.firstElement());   
          System.out.println(" Element first = "+vector.lastElement());   
           System.out.println("Remove element at index 4: " +vector.remove(4));  
           System.out.println(vector+" "+vector.size());
           System.out.println("Remove element at index 4: " +vector.remove((Integer)12));  
           System.out.println(vector+" "+vector.size());


    }
}
