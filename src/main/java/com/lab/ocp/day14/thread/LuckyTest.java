package com.lab.ocp.day14.thread;

import java.util.Random;

class LuckyNumber extends Thread {
    public LuckyNumber(String string) {
        super(string);
    }

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        // code 1
        int count = 0;
        while (true) {
            ++count;
            int n = new Random().nextInt(1000);
            // code 2
            if (n == 777) {
                break;
            }
        }
        // 輸出結果範例:小華 總共取了 261 次才得到 777
        // code 3
        System.out.printf("%s 總共取了 %d 次才得到 777\n", tname, count);
    }
    
}

public class LuckyTest {
    // code 4
    public static void main(String[] args) {
        new LuckyNumber("小明").start();
        new LuckyNumber("小華").start();
    }
}
