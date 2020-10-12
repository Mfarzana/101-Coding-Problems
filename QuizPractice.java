/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems;

import java.util.*;
/**
 *
 * @author Farzana
 */
public class QuizPractice {
    Double  i;
    double  j;
    boolean b;
    byte c ;
    
    
    //
    static Integer number=10;
    public static void main(String args []){
        //Defalult Integer value

        List<String> list=Arrays.asList("ddd","aaa","bbb","ccc");
        list.parallelStream().sorted();
//        System.out.println(list+" search "+Arrays.binarySearch("aaa", list));
        
        
       QuizPractice     qz=new QuizPractice();
        System.out.println("int i="+qz.i+" j -"+qz.j+ "boolean "+qz.b+"byte "+qz.c);
        
         Integer a= 99;
        //System.out.println((Long) a);     
        int c=9;
     if(!a.equals(c))System.out.print("dfd");
     
     
        double d =0;
        float f =a.floatValue();
        long l=a.longValue();
        short s=a.shortValue();
        System.out.println(d+" "+f+"  "+l+" "+s);
        myFunction();
         System.out.println(number);
        
         switchCase();
         
      
         
       
    }
    
    
    
   //Null ponter Exception becase defalut Integer value=null 
  public static void myFunction() {
        number++;
        System.out.println(number);
    }
  public static void switchCase(){
      //      NB:  If no break appears, the flow of control will fall through to subsequent cases until a break is reached.
         
      System.out.println("Switch Case ");
      int  j=1;
      int i=j>1?2:1;
      switch(i){
          case 0: System.out.println(0);break;
          case 1: System.out.println(1);
          case 2: System.out.println(2);//break;
          case 3: System.out.println(3);//break;
      }
      
      assignment();
      setLIstOP();
      mapOP();
  }
  
  public static void assignment(){
  
      
        int a = 34;
        double d = 20.5;

        d+=a;
        a+=d;
        d-=a;
        a-=d;

        System.out.println(" d = " + ++d );
        System.out.println(" a = " + a-- );
        
   
     
      
  }
  public static  void mapOP(){
  Map<String,String> map=new HashMap<>();
  map.put(new String("a"),"dkd");
   map.put(new String("a"),"zzzzzzzzzzzzzzz");
   map.put(null, null);    
   System.out.println(" map  "+map);
   
   
   
   //Hastable
   Hashtable<String,String> table=new Hashtable<>();
  table.put(new String("a"),"dkd");
   table.put(new String("a"),"zzzzzzzzzzzzzzz");
  // table.put(null, null);    //NULL valuue not allow
   System.out.println(" table  "+table);
   
   
      //Hastable
   Hashtable<String,String> treemap=new Hashtable<>();
  treemap.put(new String("a"),"dkd");
   treemap.put(new String("a"),"zzzzzzzzzzzzzzz");
//   treemap.put(null, null);    //Null value Not allow
   System.out.println(" TreeMap  "+treemap);
   
  }
  public static void setLIstOP(){
      
       Set<String> set=new HashSet();   
         set.add("aa"); 
         set.add("aa");
        set.add(null);
        set.add(null);
        System.out.println(" set "+set);

        
        
        Set sete=new HashSet();   
         sete.add(1); 
         sete.add("aasdd2");
        sete.add(3);
        
        System.out.println(" set "+sete);
        
                   
       List<String> list=new ArrayList<>();
       list.add(null);
        list.add(null);
         list.add("aa"); 
         list.add("aa");
         
          System.out.println("  list "+list);
  }
}
