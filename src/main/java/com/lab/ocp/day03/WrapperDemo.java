package com.lab.ocp.day03;

public class WrapperDemo {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        int a = 10;
        int b = 20;
        int c = Integer.max(a, b);
        int d = Integer.min(a, b);
        System.out.println(c);
        System.out.println(d);
        String x = "100";
        String y = "90";
        int z = Integer.parseInt(x) + Integer.parseInt(y);
        System.out.println(z);
        
    }
}
