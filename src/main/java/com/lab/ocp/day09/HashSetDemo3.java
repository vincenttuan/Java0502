package com.lab.ocp.day09;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo3 {
    public static void main(String[] args) {
        Set hs = new HashSet();
        hs.add("國文");hs.add(100);
        hs.add("數學");hs.add(90);
        hs.add("英文");hs.add(100);
        hs.add(null);hs.add(3.14);
        System.out.println(hs);
        // 求出元素中整數資料相加的結果
        // Java 7
        int sum = 0;
        for(Object obj : hs) {
            if(obj instanceof Integer) {
                sum += (Integer)obj;
            }
        }
        System.out.printf("sum: %d\n", sum);
        // Java 8 利用 stream()
        sum = hs.stream()
                .filter(obj -> obj instanceof Integer)
                .mapToInt(obj -> Integer.parseInt(obj.toString()))
                .sum();
        System.out.printf("sum: %d\n", sum);
    }
}
