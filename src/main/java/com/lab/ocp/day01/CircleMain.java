package com.lab.ocp.day01;

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.name = "圓形";
        c.r = 10;
        c.area = c.r * c.r * Math.PI;
        c.print();
    }
}
