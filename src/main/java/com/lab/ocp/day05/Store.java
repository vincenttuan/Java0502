package com.lab.ocp.day05;

public class Store {
    public static void main(String[] args) {
        Hamburger h = new Hamburger();
        h.setName("大麥克");
        h.setPrice(70);
        Hamburger h2 = new Hamburger();
        h2.setName("麥香魚");
        h2.setPrice(50);
        System.out.printf("name: %s price: %d\n", h.getName(), h.getPrice());
        System.out.printf("name: %s price: %d\n", h2.getName(), h2.getPrice());
        h.cook();
        h2.cook();
    }
}
