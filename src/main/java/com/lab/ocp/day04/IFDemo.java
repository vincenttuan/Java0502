package com.lab.ocp.day04;

import java.util.Random;

public class IFDemo {
    public static void main(String[] args) {
        int x = new Random().nextInt();
        if(isOdd(x)) {
            System.out.printf("%d 是偶數", x);
        } else {
            System.out.printf("%d 是奇數", x);
        }
    }
    public static boolean isOdd(int x) { // 判斷是否是偶數 ?
        return x % 2 == 0 ? true : false;
    }
    
}
