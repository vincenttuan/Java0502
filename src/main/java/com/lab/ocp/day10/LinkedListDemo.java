package com.lab.ocp.day10;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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
        // 利用 ListIterator 走訪元素
        ListIterator<Integer> iter = list.listIterator();
        while(iter.hasNext()) {
            int idx = iter.nextIndex();
            Integer value = iter.next();
            System.out.printf("%d : %d\n", idx, value);
        }
        while(iter.hasPrevious()) {
            int idx = iter.previousIndex();
            Integer value = iter.previous();
            System.out.printf("%d : %d\n", idx, value);
        }
        System.out.println(list.get(1));
        System.out.println(list.size());
    }
}
