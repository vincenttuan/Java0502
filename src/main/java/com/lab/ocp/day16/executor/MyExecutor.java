package com.lab.ocp.day16.executor;

import java.util.concurrent.Executor;

public class MyExecutor implements Executor {

    @Override
    public void execute(Runnable r) {
        Thread t = new Thread(r);
        t.setName("xxx");
        t.setPriority(10);
        t.start();
    }
    
}
