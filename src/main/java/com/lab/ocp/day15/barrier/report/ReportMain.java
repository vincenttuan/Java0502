package com.lab.ocp.day15.barrier.report;

import java.util.concurrent.CyclicBarrier;

public class ReportMain {
    public static void main(String[] args) {
        int parties = 3;
        Report report = new Report();
        CyclicBarrier cb = new CyclicBarrier(parties, ()->{
            System.out.println(report);
        });
        new WriterAuthor(cb, report).start();
        new WriterContent(cb, report).start();
        new WriterPrice(cb, report).start();
        
    }
}
