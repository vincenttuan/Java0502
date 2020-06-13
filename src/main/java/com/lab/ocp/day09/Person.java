package com.lab.ocp.day09;

import java.util.Set;

public class Person {
    private String name;
    private Set<Exam> exams;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Exam> getExams() {
        return exams;
    }

    public void setExams(Set<Exam> exams) {
        this.exams = exams;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", exams=" + exams + '}';
    }
    
}
