package com.lab.ocp.day03;

public class LottoArray {
    public static void main(String[] args) {
        // 在陣列中放5筆 int 亂數資料
        int[] lottos = new int[5];
        print(lottos);
        
    }
    public static void print(int [] lottos) {
        for(int lotto : lottos) {
            System.out.print(lotto + " ");
        }
        System.out.println();
    }
}
