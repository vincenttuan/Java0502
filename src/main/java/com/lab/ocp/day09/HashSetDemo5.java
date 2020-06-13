package com.lab.ocp.day09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo5 {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(100);
        hs.add(90);
        hs.add(80);
        System.out.println(hs);
        System.out.println(hs.size());
        Iterator<Integer> it = hs.iterator();
        //...
        int sum = 0;
        for(int score : hs) {
            sum += score;
        }
        System.out.println(sum);
    }
}
