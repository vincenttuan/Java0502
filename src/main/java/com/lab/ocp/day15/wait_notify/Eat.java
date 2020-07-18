package com.lab.ocp.day15.wait_notify;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Eat implements Runnable {
    private Cookie cookie;

    public Eat(Cookie cookie) {
        this.cookie = cookie;
    }
    
    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            try {
                cookie.eat(i);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
