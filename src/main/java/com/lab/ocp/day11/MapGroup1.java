package com.lab.ocp.day11;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapGroup1 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "apple", "watermelon", 
                           "apple", "orange", "watermelon", 
                           "banana", "coconut", "orange"};
        // apple:3, watermelon:2, orange:2, banana:1, coconut:1
        // 分組
        Map<String, Long> map = Stream.of(fruits)
                .collect(Collectors.groupingBy(fruit->fruit, Collectors.counting()));
        System.out.println(map);
        Map<String, Long> map2 = Stream.of(fruits)
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));
        System.out.println(map2);
        Map<String, Long> map3 = Stream.of(fruits)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map3);
    }
}
