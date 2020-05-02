package com.lab.ocp.day02;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] radius = {10, 20, 30}; // 半徑
        // 計算圓面積
        for(int i=0;i<radius.length;i++) {
            double area = Math.pow(radius[i], 2) * Math.PI;
            System.out.printf("%.2f ", area);
        }
    }
}
