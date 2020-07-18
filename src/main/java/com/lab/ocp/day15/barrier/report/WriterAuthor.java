package com.lab.ocp.day15.barrier.report;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class WriterAuthor extends Thread {
    private CyclicBarrier cb;
    private Report report;
    @Override
    public void run() {
        try {
            System.out.println("WriterAuthor 工作中...");
            Thread.sleep(new Random().nextInt(5000));
            report.setAuthor("唐鳳");
            cb.await();
        } catch (Exception e) {
        }
    }
    
}
