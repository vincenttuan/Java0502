package com.lab.ocp.day15.wait_notify;

public class Put implements Runnable {
    private Cookie cookie;

    public Put(Cookie cookie) {
        this.cookie = cookie;
    }
    
    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            cookie.put(i);
        }
    }
    
}
