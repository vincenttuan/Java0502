package com.lab.ocp.day11;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Student s1 = new Student("John", 18);
        Student s2 = new Student("Mary", 21);
        Student s3 = new Student("Helen", 17);
        
        Map<Student, Integer> map = new TreeMap<>();
        map.put(s1, 100);
        map.put(s2, 80);
        map.put(s3, 100);
        
        System.out.println(map);
    }
}

