package com.lab.ocp.day15.book;

public class BookStore {
    public static int amount = 100;
    public void borrow() { // 借書
        String tname = Thread.currentThread().getName();
        for(int i=0;i<Integer.MAX_VALUE;i++);
        System.out.printf("%s 借了第 %d 本書\n", tname, amount);
        amount--;
    }
}
