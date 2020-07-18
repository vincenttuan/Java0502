package com.lab.ocp.day15.barrier.report;

import java.util.concurrent.CyclicBarrier;

public class ReportMain {
    public static void main(String[] args) {
        int parties = 3;
        CyclicBarrier cb = new CyclicBarrier(3);
        Report report = new Report();
        new WriterAuthor(cb, report).start();
        new WriterContent(cb, report).start();
        new WriterPrice(cb, report).start();
    }
}
