package com.lab.ocp.day09;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set hs = new HashSet();
        hs.add("國文");hs.add("數學");hs.add("英文");
        System.out.println(hs);
        
        hs = new LinkedHashSet();
        hs.add("國文");hs.add("數學");hs.add("英文");
        System.out.println(hs);
        
    }
}
