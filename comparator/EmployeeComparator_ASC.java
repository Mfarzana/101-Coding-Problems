/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

import java.util.Comparator;

/**
 *
 * @author Farzana
 */
public class EmployeeComparator_ASC implements Comparator<Employee>{

    @Override
    public int compare(Employee t, Employee t1) {     
       //System.out.println(" cm val "+t.getAge().compareTo(t1.getAge())+" "+t.getAge()+" "+t1.getAge());
       int cm= t.getAge().compareTo(t1.getAge());
       if(cm==1) return -1;
       else return 1;
    }
    
}
