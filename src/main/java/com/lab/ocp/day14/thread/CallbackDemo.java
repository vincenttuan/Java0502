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
        box.set(value);
    }
    
}


public class CallbackDemo {
    
}
