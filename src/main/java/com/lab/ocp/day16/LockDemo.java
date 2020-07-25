package com.lab.ocp.day16;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

class Lotto implements Runnable {
    private String name;
    static ReentrantLock lock = new ReentrantLock();

    public Lotto(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        try {
            lock.lock();
            IntStream.rangeClosed(1, 100)
                    .forEach((i) -> System.out.printf("%s 第 %d 組號碼: %d\n", 
                                    name, i, new Random().nextInt(100)));
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }

}

public class LockDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new Lotto("Helen"));
        service.execute(new Lotto("Bob"));
        service.shutdown();
    }
}
