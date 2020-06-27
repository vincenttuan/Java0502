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
        
    }
}
