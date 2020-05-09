package com.lab.ocp.day03;

public class StringAndStringBuilder {
    public static void main(String[] args) {
        String s = "Java";
        add(s);
        System.out.println("s= " + s);
        StringBuilder sb = new StringBuilder("Java");
        add(sb);
        System.out.println("sb= " + sb);
    }
    
    public static void add(String s) {
        s = s.concat("8");
    }
    
    public static void add(StringBuilder sb) {
        sb.append("8");
    }
}
