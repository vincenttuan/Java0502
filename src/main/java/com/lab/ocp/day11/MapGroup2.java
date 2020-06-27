package com.lab.ocp.day11;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;
import javax.swing.text.html.parser.Entity;

public class MapGroup2 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "apple", "watermelon", 
                           "apple", "orange", "watermelon", 
                           "banana", "coconut", "orange"};
        // 3:[apple], 2:[watermelon, orange], 1:[banana,coconut]
        // 分組
        System.out.println(
            Stream.of(fruits)
                  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                  .entrySet() // [banana=1, orange=2, apple=3, watermelon=2, coconut=1]
                  .stream()
                  .collect(Collectors.groupingBy(Entry::getValue, 
                                                 Collectors.mapping(Entry::getKey, toList())))
        );
        
    }
}
