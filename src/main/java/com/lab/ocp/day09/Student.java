package com.lab.ocp.day09;

public class Student {
    private String name;
    private Exam[] exams;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Exam[] getExams() {
        return exams;
    }

    public void setExams(Exam[] exams) {
        this.exams = exams;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", exams=" + exams + '}';
    }

    
}
