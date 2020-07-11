package com.lab.ocp.day14.thread;

public class Runner {
    public void job() {
        String tname = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 跑了 %d 步\n", tname, i);
        }
    }
}
