package com.lab.ocp.day04;

public class IFDemo2 {
    public static void main(String[] args) {
        int x = 70;
        if(add(x)) {
            System.out.println(x);
        }
    }
    
    public static boolean add(int x) {
        if(x >= 50) {
            x = x + 1;
            return true;
        }
        return false;
    }
}
