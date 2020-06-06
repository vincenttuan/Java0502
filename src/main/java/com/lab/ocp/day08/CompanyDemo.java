package com.lab.ocp.day08;

public class CompanyDemo {
    public static void main(String[] args) {
        Company c1 = new Company();
        Company.Employee e1 = c1.new Employee();
        e1.job();
        System.out.println(e1.getSalary());
        c1.printGoal(2021);
    }
}
