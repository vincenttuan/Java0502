package com.lab.ocp.day03;

public class EqualsDemo {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'A';
        System.out.println(c1 == c2);
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equalsIgnoreCase(s2)); // 不分大小寫的比較, true
        String s3 = "Java";
        String s4 = "Java";
        System.out.println(s3 == s4); // true
        System.out.println(s3.equals(s4)); // true
        char[] c = {'J', 'a', 'v', 'a'};
        String s5 = new String(c);
        System.out.println(s5); // Java
        System.out.println(s1.equals(s5)); // true
        System.out.println(s3.equals(s5)); // true
        
    }
}
