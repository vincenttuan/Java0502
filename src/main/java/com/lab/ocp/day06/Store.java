package com.lab.ocp.day06;

public class Store {
    public static void main(String[] args) {
        Food[] foods = {
            new Drink("可樂", 25),
            new Hamburger("大麥克", 70),
            new SideDish("玉米湯", 40),
        };
        System.out.println(foods[0]);
        System.out.println(foods[1]);
        System.out.println(foods[2]);
        Food food = new Hamburger("麥香魚", 60);
        Food food2 = new Drink("咖啡", 55);
        Food food3 = new SideDish("蘋果派", 50);
        System.out.println(food);
        System.out.println(food2);
        System.out.println(food3);
    }
}
