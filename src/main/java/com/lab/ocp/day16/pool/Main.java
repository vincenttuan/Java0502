package com.lab.ocp.day16.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new Task());
        service.submit(new LongTask());
        service.submit(new LongTask());
        service.submit(new Task());
        service.submit(new Task());
        service.submit(new LongTask());
        
        // 關閉 Pool
        service.shutdown();
        
        // 監聽 pool 狀態
        while (!service.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("Pool 持續有執行緒運行中, Pool 尚未關閉.");
        }
        
        System.out.println("Pool 關閉");
    }
}
