package com.lab.ocp.day14.thread;

import java.util.Random;

class LuckyNumber extends Thread {
    public LuckyNumber(String string) {
        super(string);
    }

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        while (true) {            
            int n = new Random().nextInt(1000);
            
        }
    }
    
}

public class LuckyTest {
    
}
