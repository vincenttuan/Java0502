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
        Pen p1 = new Pen("Red", 10);
        Pen p2 = new Pen("Red", 20);
        System.out.println(p1);
        System.out.println(p2);
        System.out.printf("p1 == p2 %b\n", p1 == p2);
        System.out.printf("p1.equals(p2) %b\n", p1.equals(p2));
    }
}
