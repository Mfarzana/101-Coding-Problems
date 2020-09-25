/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author Farzana
 */


public class ServedStudentPriorityOrder {
    public static void main (String args[]){
    List<String> list=new ArrayList<>();
    list.add("ENTER John 3.75 50");
    list.add("ENTER Mark 3.8 24");
    //list.add("ENTER Shafaet 3.7 35");
    list.add("SERVED");
    list.add("SERVED");
    list.add("ENTER Samiha 3.85 36");
    list.add("SERVED");
    list.add("ENTER Ashley 3.9 42");
    list.add("ENTER Anik 3.95 49");
    list.add("ENTER Dan 3.95 50");    
    list.add("SERVED");
   
    Priorities p= new Priorities();
           
    List<Student> slist=p.getStudents(list);
    for(Student s: slist){
        System.out.println(s);
    }


    }
}
class  Priorities{
public List<Student> getStudents(List<String> events){
    PriorityQueue<Student>queue=new PriorityQueue<>();
    for(String s: events){
        String arr[]=s.split(" ");
         if(!arr[0].equals("SERVED")){
             queue.add(new Student(arr[1],Double.parseDouble(arr[2]),Integer.parseInt(arr[3]),arr[0]));                     
         }
    }
   List<Student>list=new ArrayList<>();
   while(!queue.isEmpty()){
       list.add(queue.poll());
   }
   return list;
}
     
}
class Student implements Comparable<Student>{
    private String name;
    private Double cgpa;
    private Integer id;
    private String type;
    

    /*
The student having the highest Cumulative Grade Point Average (CGPA) is served first.
Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
Any students having the same CGPA and name will be served in ascending order of the id.
*/
    public int compareTo(Student s){
        if(cgpa>s.cgpa) return -1; // height cgpa serve first
        else if(cgpa==s.cgpa && name.equals(s.name)) return id-s.id;// cgpa and name same then serve by id 
        else if(cgpa==s.cgpa) return name.compareTo(s.name);// same cgpa serve by name 
        return 1;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", cgpa=" + cgpa + ", id=" + id + ", type=" + type + '}';
    }

    

    public Student(String name, Double cgpa, Integer id, String type) {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
        this.type = type;
    }
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
/*
Input*
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED
Your Output (stdout)
Dan
Ashley
Shafaet
Maria
*/