package com.lab.ocp.day02.bar;

public class CellPhone {
    public void job() {
        System.out.println("打電話 + Game");
        Phone p = new Phone();
        p.job();
    }
    void price() {
        System.out.println("$10000");
    }
}
