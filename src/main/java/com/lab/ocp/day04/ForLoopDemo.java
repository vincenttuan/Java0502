package com.lab.ocp.day04;

public class ForLoopDemo {
    static int i;
    public static void main(String[] args) {
        // 印出 1~10
        for(int i=1;i<=10;i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        // 印出 1~10 part II
        for(init();expr();step()) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
    public static void init() { // 初始區段
        i = 1;
    }
    public static boolean expr() { // 判斷邏輯
        return i <= 10 ? true : false;
    }
    public static void step() { // 步進敘述
        i++;
    }
    
}
