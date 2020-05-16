package com.lab.ocp.day04;

import java.util.stream.IntStream;

public class ForLoopDemo2 {
    public static void main(String[] args) {
        // Java 8 loop
        IntStream.rangeClosed(1, 10).forEach(i -> {System.out.print(i);});
        System.out.println();
        String[] names = {"John", "Mary", "Tom", "Helen", "Yuki"};
        IntStream.range(0, names.length).forEach(i -> System.out.print(names[i]));
        System.out.println();
        // Java 8 (聲明式語法) 過濾資料
        IntStream.range(0, names.length)
                .filter(i -> names[i].length() >= 4)  // 名字長度 >= 4 才要
                .forEach(i -> System.out.print(names[i]));
        System.out.println();
        // Java 7 (命令式語法) 過濾資料
        for(int i=0;i<names.length;i++) {
            if(names[i].length() >= 4) {
                System.out.print(names[i]);
            }
        }
        System.out.println();
        
    }
}
