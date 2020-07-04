package com.lab.ocp.day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        input();
    }

    public static void input() {
        int[] y = {2, 5, 0}; // 分母
        System.out.print("請輸入分子: ");
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt(); // 取得使用者所輸入的分子
            System.out.print("請選擇分母的陣列維度(0:2, 1:5, 2:0): ");
            int idx = sc.nextInt(); // 取得使用者所輸入的維度值
            int result = x / y[idx];
            System.out.printf("%d / %d = %d\n", x, y[idx], result);
        } catch (InputMismatchException e) {
            System.out.println("請輸入數字, 錯誤原因:" + e);
        }
        System.out.println("Finish");
    }
}
