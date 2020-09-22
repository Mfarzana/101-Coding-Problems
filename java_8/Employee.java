/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_8;

/**
 *
 * @author Farzana
 */
public class Employee {
    private String name;
    private int id;
    private double salary;

    Employee(int id, String name, double salary) {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id + ", salary=" + salary + '}';
    }
    
    //Use method For InstanceMethodReferenceParticularObject Class
    public int compareTo(Employee e){
        if(this.salary<=e.salary)
            return 1;
        else return -1;    
    }
}
