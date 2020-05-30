package com.lab.ocp.day07;

public class EqualsDemo {
    public static void main(String[] args) {
        int x = 100;
        int y = 100;
        System.out.printf("x == y %b\n", x == y);
        String a = new String("Java");
        String b = new String("Java");
        System.out.printf("a == b %b\n", a == b);
        System.out.printf("a.equals(b) %b\n", a.equals(b));
        
    }
}
