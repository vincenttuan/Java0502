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
        while (true) {            
            int n = new Random().nextInt(1000);
            // code 2
        }
        // 輸出結果範例:小華 總共取了 261 次才得到 777
        // code 3
    }
    
}

public class LuckyTest {
    // code 4
}
