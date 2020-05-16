package com.lab.ocp.day04;

import java.util.Arrays;

public class ForLoopDemo3 {
    public static void main(String[] args) {
        String[] names = {"John", "Mary", "Tom", "Helen", "Yuki"};
        // Java 8
        Arrays.stream(names)
                .forEach(name -> System.out.print(name));
        System.out.println();
        // Java 7 for-each (自動抓取)
        for(String name : names) {
            System.out.print(name);
        }
        System.out.println();
        
    }
}
