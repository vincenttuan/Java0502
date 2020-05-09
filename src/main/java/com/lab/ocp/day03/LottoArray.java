package com.lab.ocp.day03;

import java.util.Random;

public class LottoArray {
    public static void main(String[] args) {
        // 在陣列中放5筆 int 亂數資料
        int[] lottos = new int[5];
        print(lottos);
        putData(lottos);
        print(lottos);
        System.out.println(hasExist(7, lottos));
        clearData(lottos);
        print(lottos);
    }
    
    // 放資料
    public static void putData(int[] lottos) {
        for(int i=0;i<lottos.length;i++) {
            lottos[i] = new Random().nextInt(9) + 1; // 得到 1~9 的亂數
        }
    }
    
    // 放資料(不可重複)
    public static void putData2(int [] lottos) {
        
    }
    
    // 資料是否存在在指定陣列中
    public static boolean hasExist(int n, int [] lottos) {
        boolean exist = false;
        for(int i=0;i<lottos.length;i++) {
            if(lottos[i] == n) {
                exist = true;
                break;
            }
        }
        return exist;
    }
    
    // 清空資料
    public static void clearData(int [] lottos) {
        for(int i=0;i<lottos.length;i++) {
            lottos[i] = 0;
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
