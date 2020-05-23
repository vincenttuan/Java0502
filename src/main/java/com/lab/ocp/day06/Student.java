package com.lab.ocp.day06;

public class Student extends Person {
    private Exam exam;

    public Student() {
    }
    
    public Student(String name) {
        super(name);
    }
    
    public Student(Exam exam) {
        this.exam = exam;
    }

    public Student(Exam exam, String name) {
        super(name);
        this.exam = exam;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "Student{name" + getName() + ", exam=" + exam + '}';
    }
    
    
}
