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
        putData2(lottos);
        print(lottos);
        sort(lottos);
        print(lottos);
        System.out.printf("max: %d\n", max(lottos));
    }
    
    // 放資料
    public static void putData(int[] lottos) {
        for(int i=0;i<lottos.length;i++) {
            lottos[i] = new Random().nextInt(9) + 1; // 得到 1~9 的亂數
        }
    }
    
    // 放資料(不可重複)
    public static void putData2(int [] lottos) {
        for(int i=0;i<lottos.length;) {
            int n = new Random().nextInt(9) + 1;
            if(!hasExist(n, lottos)) { // n 是否存在 lottos 中 ?
                lottos[i] = n;
                i++;
            }
        }
    }
    
    // 資料n是否存在在指定陣列lottos中
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
    
    // 資料排序(小 -> 大)
    public static void sort(int [] lottos) {
        for (int i = 0; i < lottos.length; i++) {
            for (int j = i+1; j < lottos.length; j++) {
                if(lottos[i] > lottos[j]) {
                    int n1 = lottos[i];
                    lottos[i] = lottos[j];
                    lottos[j] = n1;
                }
            }
        }
    }
    
    // 取出最大值
    public static int max(int [] lottos) {
        int max = 0;
        for(int i=0;i<lottos.length;i++) {
            if(lottos[i] > max) {
                max = lottos[i];
            }
        }
        return max;
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
