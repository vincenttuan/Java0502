package com.lab.ocp.day14.thread;

import java.util.Random;

class Egg extends Thread {
    int[] e = new int[10];
    @Override
    public void run() {
        for (int i = 0; i < e.length; i++) {
            try {
                Thread.sleep(new Random().nextInt(5000));
                e[i] = new Random().nextInt(100) + 1;
            } catch (Exception e) {
            }
        }
    }
}

class Bread extends Thread {
    int[] b = new int[10];
    @Override
    public void run() {
        for (int i = 0; i < b.length; i++) {
            try {
                Thread.sleep(new Random().nextInt(5000));
                b[i] = new Random().nextInt(100) + 1;
            } catch (Exception e) {
            }
        }
    }
}

public class UserTest {

}
