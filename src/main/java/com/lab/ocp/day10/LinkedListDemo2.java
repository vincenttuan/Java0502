package com.lab.ocp.day10;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        List<Integer> scores = new LinkedList<>();
        IntStream.rangeClosed(1, 10)
                .forEach(i -> scores.add(new Random().nextInt(11)));
        System.out.println(scores);
        Collections.sort(scores); // 排序: 小->大
        System.out.println(scores);
        scores.remove(0);
        scores.remove(0);
        scores.remove(scores.size()-1);
        scores.remove(scores.size()-1);
        System.out.println(scores);
        
        double avg = scores.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        System.out.printf("%.1f\n", avg);
    }
}
