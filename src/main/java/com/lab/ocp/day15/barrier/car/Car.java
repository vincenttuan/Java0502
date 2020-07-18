package com.lab.ocp.day15.barrier.car;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car extends Thread {
    private CyclicBarrier cb;

    public Car(CyclicBarrier cb) {
        this.cb = cb;
    }
    
    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        System.out.printf("%s 從台北出發...\n", tname);
        try {
            Thread.sleep(new Random().nextInt(5000));
            System.out.printf("%s 到台中了!\n", tname);
            cb.await(); // 等待其他執行緒
        } catch (Exception e) {
            System.out.printf("%s 發生車禍了!\n", tname);
            return;
        }
        System.out.printf("%s 繼續往高雄出發...\n", tname);
        
    }
    
}
