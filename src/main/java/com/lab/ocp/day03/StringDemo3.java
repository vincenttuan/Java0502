package com.lab.ocp.day03;

public class StringDemo3 {
    public static void main(String[] args) {
        String s = "Java";
        s = add(s);
        System.out.println(s);
    }
    public static String add(String s) {
        //s = s + "8";
        s = s.concat("8");
        return s;
    }
}
