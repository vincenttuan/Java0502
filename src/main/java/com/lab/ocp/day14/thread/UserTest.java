package com.lab.ocp.day14.thread;

import java.util.Random;

class Egg extends Thread {

    int[] e = new int[10];

    @Override
    public void run() {
        for (int i = 0; i < e.length; i++) {
            try {
                Thread.sleep(new Random().nextInt(5000));
                int value = new Random().nextInt(100) + 1;
                e[i] = value;
                System.out.printf("煎蛋 e[%d] = %d\n", i, value);
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
                int value = new Random().nextInt(100) + 1;
                b[i] = value;
                System.out.printf("麵包 b[%d] = %d\n", i, value);
            } catch (Exception e) {
            }
        }
    }
}

class User extends Thread {

    Egg egg;
    Bread bread;

    public User(Egg egg, Bread bread) {
        this.egg = egg;
        this.bread = bread;
    }

    int[] u = new int[10];

    @Override
    public void run() {
        for (int i = 0; i < u.length;) {
            // print 出每一個 e[i] + b[i] 的資料
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            if(egg.e[i] != 0 && bread.b[i] != 0) {
                u[i] = egg.e[i] + bread.b[i];
                System.out.printf("\t三明治 u[%d] = %d\n", i, u[i]);
                i++;
            }
        }
    }
}

public class UserTest {
    
    public static void main(String[] args) {
        Egg egg = new Egg();
        Bread bread = new Bread();
        User user = new User(egg, bread);
        egg.start();
        bread.start();
        user.start();
    }
}
