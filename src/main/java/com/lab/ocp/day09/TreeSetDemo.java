package com.lab.ocp.day09;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> lotto = new TreeSet<>();
        lotto.add(10);
        lotto.add(50);
        lotto.add(20);
        lotto.add(40);
        lotto.add(30);
        System.out.println(lotto);
        
    }
}
