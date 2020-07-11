package com.lab.ocp.day14.thread;

import java.util.Random;

interface Box {
    void set(int value);
}

class Put extends Thread {
    private Box box;

    public Put(Box box) {
        this.box = box;
    }
    
    @Override
    public void run() {
        int value = new Random().nextInt(100);
        System.out.printf("value= %d\n", value);
        box.set(value);
    }
}

public class CallbackDemo {
    public static void main(String[] args) {
        Box box = (value) -> System.out.println(value * 30.1);
        Put put = new Put(box);
        put.start();
    }
}
