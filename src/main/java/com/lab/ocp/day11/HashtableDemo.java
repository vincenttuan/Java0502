package com.lab.ocp.day11;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> map = new Hashtable<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        System.out.println(map);
        Enumeration<Integer> e = map.elements();
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
