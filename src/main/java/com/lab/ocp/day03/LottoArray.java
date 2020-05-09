package com.lab.ocp.day03;

import java.util.Random;

public class LottoArray {
    public static void main(String[] args) {
        // 在陣列中放5筆 int 亂數資料
        int[] lottos = new int[5];
        print(lottos);
        putData(lottos);
        print(lottos);
    }
    
    // 放資料
    public static void putData(int[] lottos) {
        for(int i=0;i<lottos.length;i++) {
            lottos[i] = new Random().nextInt(9) + 1; // 得到 1~9 的亂數
        }
    }
    
    // 印資料
    public static void print(int [] lottos) {
        for(int lotto : lottos) {
            System.out.print(lotto + " ");
        }
        System.out.println();
    }
}
