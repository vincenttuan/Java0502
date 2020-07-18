package com.lab.ocp.day15.barrier.report;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class WriterContent extends Thread {
    private CyclicBarrier cb;
    private Report report;
    @Override
    public void run() {
        try {
            System.out.println("WriterContent 工作中...");
            Thread.sleep(new Random().nextInt(5000));
            report.setContent("趕快去領三倍券~~");
            cb.await();
        } catch (Exception e) {
        }
    }
    
}
