package com.lab.ocp.day04;

public class IFDemo3 {
    static int x = 70;
    public static void main(String[] args) {
        if(add(x)) {
            System.out.println(x);
        }
    }
    
    public static boolean add(int x) {
        if(x >= 50) {
            IFDemo3.x = x + 1;
            return true;
        }
        return false;
    }
}
