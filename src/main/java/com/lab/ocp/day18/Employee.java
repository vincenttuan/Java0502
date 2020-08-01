package com.lab.ocp.day18;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    //private transient int salary;
    private int salary;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';
    }
    
}
