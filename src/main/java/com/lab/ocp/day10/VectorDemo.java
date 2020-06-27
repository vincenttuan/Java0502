package com.lab.ocp.day10;

import java.util.Vector;
import java.util.stream.IntStream;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(100, 5);
        IntStream.rangeClosed(1, 101).forEach(v::add); // i -> v.add(i)
        System.out.println(v);
        System.out.printf("size: %d, capacity: %d\n", v.size(), v.capacity());
    }
}
