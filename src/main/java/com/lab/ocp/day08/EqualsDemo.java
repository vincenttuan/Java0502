package com.lab.ocp.day08;

public class EqualsDemo {
    public static void main(String[] args) {
        int x = 100;
        int y = 100;
        System.out.println(x == y);
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);
        String s3 = new String("Java");
        String s4 = new String("Java");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
