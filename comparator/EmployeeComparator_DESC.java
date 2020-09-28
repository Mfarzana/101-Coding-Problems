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
//t sorts them in order of decreasing score; if  or more objects have the same score, 
//sort those obejects alphabetically by name.

public class EmployeeComparator_DESC implements Comparator<Employee>{
    public int compare(Employee a, Employee b){
        int com=a.getAge().compareTo(b.getAge());
        if(a.getAge()==b.getAge()) return a.getName().compareTo(b.getName());
        else if(com==1) return -1;
        else return 1;
    }
}
