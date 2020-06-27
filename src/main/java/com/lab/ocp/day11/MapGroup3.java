package com.lab.ocp.day11;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;

public class MapGroup3 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "apple", "watermelon", 
                           "apple", "orange", "watermelon", 
                           "banana", "coconut", "orange"};
        // [orange, banana, apple, watermelon, coconut]
        // apple:5, banana:6, orange:6, coconut:7, watermelon:10
        // 5:[apple], 6:[banana, orange], 7:[coconut], 10:[watermelon]
        // 分組
        System.out.println(
            Stream.of(fruits)
                .collect(toSet()) 
                // [orange, banana, apple, watermelon, coconut]
                .stream()
                .collect(toMap(String::toString, String::length)) 
                // {banana=6, orange=6, apple=5, watermelon=10, coconut=7}
                .entrySet()
                .stream()
                .collect(Collectors.groupingBy(Entry::getValue, 
                                               Collectors.mapping(Entry::getKey, toList()))) 
                // {5=[apple], 6=[banana, orange], 7=[coconut], 10=[watermelon]}
        );
        
        
    }
}
