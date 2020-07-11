package com.lab.ocp.day14.thread;
// 繼承 extends
// 實作 run()
public class Runner extends Thread {

    @Override
    public void run() {
        job();
    }
    
    public void job() {
        String tname = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 跑了 %d 步\n", tname, i);
        }
    }
}
