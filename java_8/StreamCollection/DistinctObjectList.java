/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;

/**
 *
 * @author Farzana
 */
public class DistinctObjectList {
    
    public static void main(String args[]){
        List<Student> students=new ArrayList<>();
        students.add(new Student("Tomy",22,2.5,"BD"));
        students.add(new Student("Zomey",11,3.5,"JP"));
        students.add(new Student("Yomy",11,3.5,"BD"));
        students.add(new Student("Anoneomy",12,4.25,"JP"));
        students.add(new Student("Tomy",22,2.5,"BD"));
        
       System.out.println("Before steam : "+students);

        List<Student> slist=students.stream().filter(distinctByKey(s->s.name)).collect(Collectors.toList());
        System.out.println("after stream : "+slist);
        
        // Grpou by cgpa
        /*
        https://stackoverflow.com/questions/21678430/group-a-list-of-objects-by-an-attribute-java
        
*/       //https://www.baeldung.com/java-groupingby-collector
        Map<Double, List<Student>> groupList = slist.stream().collect(groupingBy(Student::getCgpa));        
        System.out.println("Group by cgpa on distinct stream : "+groupList);
        
        //Multipe feild gourping 

        
        

    }
     private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
class Student{
    String name;
    Integer roll;
    Double cgpa;
    String location;
    Student(String name, Integer roll, Double cgpa,String location){
        this.name=name;
        this.roll=roll;
        this.cgpa=cgpa;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", roll=" + roll + ", cgpa=" + cgpa + ", location=" + location + '}';
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }
    
}