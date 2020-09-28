/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

import java.util.ArrayList;
import java.util.*;

/*
 *
 * @author Farzana
 */
public class Main {
    public static void main(String args[]){
    
        Employee e=new Employee("Jon",30);
        Employee e1=new Employee("Blown",40);
        Employee e2=new Employee("Pinet",20);

        List<Employee> eList=new ArrayList<>();
        eList.add(e);
        eList.add(e1);
        eList.add(e2);
        
        // Sort by Acending order 
        EmployeeComparator_ASC com=new EmployeeComparator_ASC();
        System.out.println(eList);
        Collections.sort(eList, com);
        System.out.println(eList);
        
        
        // Decending oder
        List<Employee> descList=new ArrayList<>();
        descList.add(e);
        descList.add(e1);
        descList.add(e2);
        descList.add(new Employee("Boris",30));
        EmployeeComparator_DESC empd=new EmployeeComparator_DESC();
        Collections.sort(descList,empd);
        System.out.println(descList);

        
        
        

    }
}
