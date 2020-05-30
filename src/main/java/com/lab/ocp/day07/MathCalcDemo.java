package com.lab.ocp.day07;

public class MathCalcDemo {
    public static void main(String[] args) {
        System.out.println(calc(100, 10));
        System.out.println(calc(100.0, 10.0));
        System.out.println(calc(100.0, 10.0f));
        System.out.println(calc(100, 10.0f));
    }
    
    public static int calc(int x, int y) {
        return x + y;
    }
    
    public static double calc(double x, double y) {
        return x * y;
    }
    
    public static double calc(double x, float y) {
        return x / y;
    }
    
    public static float calc(int x, float y) {
        return x - y;
    }
    
    
    
    
}
