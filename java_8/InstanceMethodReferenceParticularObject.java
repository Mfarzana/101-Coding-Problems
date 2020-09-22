/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_8;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Farzana
 */
/*
You can call a method from a particular instantiated object by referencing the method using the reference variable of the object.
*/
public class InstanceMethodReferenceParticularObject {
    public int compareObject(Employee e1, Employee e2){
        return e1.compareTo(e2);
    }
    
    public static void main(String args[]){
    
        ArrayList<Employee> ar = new ArrayList<Employee>(); 
        ar.add(new Employee(111, "bbbb", 10000.00)); 
        ar.add(new Employee(131, "xaaaa", 2000.00)); 
        ar.add(new Employee(121, "yccccop", 5699.00)); 
        
        System.out.println(ar.toString());
        //By reference object
        InstanceMethodReferenceParticularObject obj=new InstanceMethodReferenceParticularObject();
        Collections.sort(ar,obj::compareObject);
        
        System.out.println(ar.toString());

        
        

    }
}
