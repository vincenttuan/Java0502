package com.lab.ocp.day10;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(90);
        list.add(90);
        list.add(0, 80);
        System.out.println(list);
        list.forEach(System.out::println);
        //int sum = list.stream().mapToInt(item -> item.intValue()).sum();
        //int sum = list.stream().mapToInt(item -> item).sum();
        //int sum = list.stream().mapToInt(Integer::valueOf).sum();
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
