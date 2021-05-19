/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _101_Coding_Problems.java_base;

import java.util.HashSet;
import java.util.PriorityQueue;

/**
 *
 * @author Farzana
 */
public class PriorityQueueExaple {
    
    public static void main(String args[]){
    
          // Natutal Order
        PriorityQueue<String> pq=new PriorityQueue<String>();
        pq.add("12test"); 
        pq.add("nano");
        pq.add("enav");
        pq.add("bob");
        pq.add("raku");
        while(!pq.isEmpty()){
            System.out.print("  "+pq.poll());
        }

       Student s1=new Student("yon", 3,4.00);
       Student s2=new Student("Jerry",4,2.5);
       Student s3=new Student("Ben",1,3.0);
       Student s4=new Student("IOP",2,3.1); 
        Student s5=new Student("KO",5,3.2);
       Student s6=new Student("KO",5,3.2);
         
        PriorityQueue<Student> students=new PriorityQueue<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        
        
        while(!students.isEmpty()){
            System.out.println(" "+students.poll().toString()+" ");
        }
                 System.out.println("......................Hashset remove duplicate value.......................... ");

        HashSet<Student> set = new HashSet<>(); 
         set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);
        
       for(Student obj: set){
           System.out.println(" "+obj);
       }
    }
}
class Student implements Comparable<Student>{
    private String name;
    private Integer id;
    private Double cgpa;
    
    Student(String name, Integer id, Double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
   @Override
    public int compareTo(Student s){
        return s.cgpa>this.cgpa?1:-1;
    }
    
    @Override
    // if both the object references are 
    // referring to the same object. 
    public boolean equals(Object obj) 
    { 
        if (this == obj) 
            return true; 
        if (obj == null) 
            return false; 
        if (getClass() != obj.getClass()) 
            return false; 
  
        // type casting of the argument. 
        Student other = (Student)obj; 
  
        // comparing the state of argument with 
        // the state of 'this' Object 
        if (this.id == other.id) 
            return true; 
      /*   if (this.name == null) { 
            if (other.name != null) 
                return false; 
        } 
       else if (!name.equals(other.name)) 
            return false; */
        return false; 
    } 
    
    @Override
    public int hashCode() 
    {        
      return id.hashCode();
    } 
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", cgpa=" + cgpa +  ", eqals=" + equals(this) + ", hascode=" + hashCode() + '}';
    }
    
    /*
    This is a simple Java class to store Students.
    This class implements comparable interface, so that we can decide on what basis this object needs to be ordered in the priority queue.

    The ordering is decided by the compareTo function in the above code. The line s.cgpa > this.cgpa ? 1 : -1
    instructs that the cgpa should be sorted based on descending order of the orderId field
    */
}