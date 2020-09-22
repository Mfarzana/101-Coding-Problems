/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Farzana
 */
public class StreamAPI {
    /*
    There are many ways to obtain a Java Stream. One of the most common ways to obtain a Stream is from a Java Collection. 
    Here is an example of obtaining a Stream from a Java List:
    */   
   
   public  static void obtainAStream(List<String> list){  //return stream
       Stream<String> st=list.stream();      
   }
   /*
   The non-terminal stream operations of the Java Stream API are operations that transform or filter the elements in the stream. When you add a non-terminal operation to a stream, you get a new stream back as result. The new stream represents the stream of elements resulting from the original stream with the non-terminal operation applied.
   Here is an example of a non-terminal operation added to a stream - which results in a new stream:
   */
   
   public static void nonTerminalOperation(List<String> list){  //return stream
       Stream<String> stm=list.stream();
       
       Stream<String> stm2=stm.map((val)->{ return val.toLowerCase();}); //treansform elements to stream
       Stream<String> stm3=stm2.map((val)->{   return val.substring(0,3);   });
       //Notice the call to stream map() 
       //. This call actually returns a new Stream instance representing the original stream of strings with the map operation applied.
   
   }
   
   /*
   The Stream interface has a selection of terminal and non-terminal operations. A non-terminal stream operation is an operation that adds a listener to the stream without doing anything else.
   A terminal stream operation is an operation that starts the internal iteration of the elements, calls all the listeners, and returns a result.
   */
   public static void terminalAndNonTerminalOperations(List<String> list){  //return result
       Stream<String> steam=list.stream();
       long count=steam.map((val)->{return val.toLowerCase();}).count(); //internal iterate element and return result
       
       System.out.print(count+" count value ");
   } 
    
    public static void main(String args[]){
        List<String> items = new ArrayList<String>();
        items.add("TYTYTUNNB");
        items.add("DMMMMMMGDGTETGFFGDFD");
        items.add("DJGOIEIRTJEKFGDF");
        
        obtainAStream(items);
        nonTerminalOperation(items);
        terminalAndNonTerminalOperations(items);
 
     // More example on terminal and nontoerminal
     List<Integer> intList=Arrays.asList(2,3,4,5,6);
     
     //map() example
     System.out.println(intList);
     List<Integer> mapExample=intList.stream().map((i)->i*i).collect(Collectors.toList());
     System.out.println(mapExample);
     
     //filter example 
     List<String> strList=Arrays.asList("Reflection","Collection","Stream");       
     System.out.println(strList);
     List<String> filterExample=strList.stream().filter(str->str.startsWith("Ref")).collect(Collectors.toList());
     System.out.println(filterExample);
     
     //Sorted() Example 
     List<String> sortExample=strList.stream().sorted().collect(Collectors.toList());
     System.out.println(sortExample);
     
     //forEach() Example 
     strList.stream().map(i->i).forEach(y->System.out.print(" val>>"+y));
     strList.stream().map(i->i.substring(0,3)).forEach(y->System.out.print(" val>>"+y));
     
     //distinct() example
       List<Integer> intList2=Arrays.asList(2,6,4,4,3,4,5,6);
       List<Integer> uniqueList=intList2.stream().distinct().collect(Collectors.toList());
       System.out.println(uniqueList);
       
    
    }
}
