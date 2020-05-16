package com.lab.ocp.day04;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ForLoopDemo4 {
    public static void main(String[] args) {
        String[] names = {"John", "Mary", "Tom", "Helen", "Yuki"};
        int sum = Arrays.stream(names)
                    .filter(name -> name.length() <= 4)
                    .filter(name -> name.contains("o"))
                    .mapToInt(name -> name.length())
                    .sum();
        System.out.printf("sum = %d\n", sum);
        // 平均是幾個字 ?
        double avg = Arrays.stream(names)
                    //.peek(System.out::print)
                    .mapToInt(name -> name.length())
                    //.peek(System.out::print)
                    .average().getAsDouble();
                    //.forEach(System.out::print); // name -> System.out.print(name)
        System.out.printf("avg = %.1f\n", avg);
        
        // 敘述統計
        IntSummaryStatistics stat = Arrays.stream(names)
                .mapToInt(name -> name.length())
                .summaryStatistics();
        System.out.println(stat);
        System.out.println(stat.getMax());
        
    }
}
