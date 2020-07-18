package com.lab.ocp.day15.barrier.report;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class WriterPrice extends Thread {
    private CyclicBarrier cb;
    private Report report;

    public WriterPrice(CyclicBarrier cb, Report report) {
        this.cb = cb;
        this.report = report;
    }
    
    @Override
    public void run() {
        try {
            System.out.println("WriterPrice 工作中...");
            Thread.sleep(new Random().nextInt(5000));
            report.setPrice(3000);
            cb.await();
        } catch (Exception e) {
        }
    }
    
}
