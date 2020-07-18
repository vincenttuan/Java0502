package com.lab.ocp.day15;

public class BallGame implements Runnable {
    private int amount = 10;

    @Override
    public void run() {
        while (amount > 0) {            
            get();
        }
    }
    
    public void get() {
        String tname = Thread.currentThread().getName();
        System.out.printf("%s 取到第 %d 顆球\n", tname, amount);
        amount--;
    }
}
