package com.lab.ocp.day15;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class LuckyNumber implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.printf("%s 執行中...\n", Thread.currentThread().getName());
        Thread.sleep(new Random().nextInt(5000));
        int n = new Random().nextInt(100);
        return n;
    }
}

// 執行緒回傳值
public class CallableDemo {
    public static void main(String[] args) throws Exception {
        LuckyNumber number = new LuckyNumber();
        FutureTask<Integer> task = new FutureTask<>(number);
        new Thread(task).start();
        System.out.println(task.get());
    }
    
}
