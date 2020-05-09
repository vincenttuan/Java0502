package com.lab.ocp.day03;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "Java";
        System.out.println("在 main 方法的 s=" + s);
        add(s);
        System.out.println("在 main 方法的 s=" + s);
    }
    
    public static void add(String s) {
        System.out.println("在 add 方法的 s=" + s);
        s = s + "8";
        System.out.println("在 add 方法的 s=" + s);
    }
}
