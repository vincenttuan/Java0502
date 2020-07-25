package com.lab.ocp.day16;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

class Lotto implements Runnable {
    static ReentrantLock lock = new ReentrantLock();
    
    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        try {
            lock.lock();
            IntStream.rangeClosed(1, 5)
                    .forEach((i) -> System.out.printf("%s (%d) -> %d", 
                                    tName, i, new Random().nextInt(100)));
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }

}

public class LockDemo {
    
}
