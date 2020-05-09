package com.lab.ocp.day03;

public class WrapperDemo2 {
    public static void main(String[] args) {
        int a = 100;
        a = 200;
        //Integer b = Integer.valueOf("100"); // Java 5 之前
        Integer b = 100; // Java 5 (含)之後, auto-boxing 自動裝箱
        b = 200;
        System.out.println(a); // int
        System.out.println(b); // Integer
        System.out.println(a + b.intValue()); // Java 5 之前
        System.out.println(a + b); // Java 5 (含)之後, auto-unboxing 自動拆箱
    }
}
