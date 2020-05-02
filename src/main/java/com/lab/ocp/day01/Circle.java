package com.lab.ocp.day01;

public class Circle {
    static String name; // 名字
    int r; // 半徑
    double area; // 面積
    void print() { // 印出資料
        area = r * r * Math.PI;
        System.out.println(name);
        System.out.println(r);
        System.out.println(area);
    }
}
