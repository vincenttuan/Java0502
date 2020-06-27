package com.lab.ocp.day10;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        System.out.println(getInt());
        System.out.println(getInteger());
    }
    
    public static int getInt() {
        Integer integer = new Integer("100");
        return integer; // integer.intValue(); // 自動拆箱 auto-unboxing
    }
    
    public static Integer getInteger() {
        int i = 100;
        return i; // Integer.valueOf(i); // 自動裝箱 auto-boxing
    }
}
