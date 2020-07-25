package com.lab.ocp.day16.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new Task());
        service.submit(new LongTask());
        service.submit(new LongTask());
        service.submit(new Task());
        service.submit(new Task());
        service.submit(new LongTask());
        
        service.shutdown();
        
        System.out.println("Pool 關閉");
    }
}
