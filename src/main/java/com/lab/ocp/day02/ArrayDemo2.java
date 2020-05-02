package com.lab.ocp.day02;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] lens = {100, 90, 80}; // 長度s
        int[] wids = new int[]{30, 20, 10};  // 寬度s
        for(int i=0;i<lens.length;i++) {
            System.out.print(lens[i] + " ");
        }
        for(int i=0;i<wids.length;i++) {
            System.out.print(wids[i] + " ");
        }
        System.out.println("\n--------------------");
        // 求面積
        for(int i=0;i<lens.length;i++) {
            int area = lens[i] * wids[i];
            System.out.print(area + " ");
        }
    }
}
