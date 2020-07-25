package com.lab.ocp.day16.pool;

import java.util.Random;

public class Task implements Runnable {
    @Override
    public void run() {
        int n = new Random().nextInt(10);
        System.out.printf("短任務(得到0~9的值): %d\n", n);
    }
}
