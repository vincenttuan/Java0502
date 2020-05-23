package com.lab.ocp.day06;

public class Classroom {
    public static void main(String[] args) {
        Teacher t = new Teacher("Vincent");
        
        Student s1 = new Student("John");
        Exam exam1 = new Exam("1z0-808", 85);
        s1.setExam(exam1);
        
        Student s2 = new Student("Mary");
        Exam exam2 = new Exam("1z0-808", 40);
        s2.setExam(exam2);
        
        Student s3 = new Student("Tom");
        Exam exam3 = new Exam("1z0-808", 72);
        s3.setExam(exam3);
        
        
    }
}
