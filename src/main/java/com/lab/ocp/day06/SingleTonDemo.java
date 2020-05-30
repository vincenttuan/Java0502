package com.lab.ocp.day06;

public class SingleTonDemo {
    public static void main(String[] args) {
        SingleDB db = SingleDB.getInstance();
        System.out.println(db.getData());
        SingleDB db2 = SingleDB.getInstance();
        System.out.println(db2.getData());
    }
}
