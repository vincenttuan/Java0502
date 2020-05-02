package com.lab.ocp.day01;

public class CircleMain {
    public static void main(String[] args) {
        Circle.name = "圓形";
        Circle c = new Circle();
        c.r = 10;
        c.print();
        Circle c2 = new Circle();
        c2.r = 5;
        c2.print();
    }
}
