package com.lab.ocp.day03;

public class EqualsDemo {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'A';
        System.out.println(c1 == c2);
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2)); // 不分大小寫的比較
        
    }
}
