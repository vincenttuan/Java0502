package com.lab.ocp.day14.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class BuyPapaya implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "木瓜";
    }
}

class BuyMilk implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "牛奶";
    }
}

public class PapayaMilk {
    public static void main(String[] args) throws Exception {
        BuyPapaya papaya = new BuyPapaya();
        BuyMilk milk = new BuyMilk();
        FutureTask<String> task1 = new FutureTask<>(papaya);
        FutureTask<String> task2 = new FutureTask<>(milk);
        new Thread(task1).start();
        new Thread(task2).start();
        String data1 = task1.get();
        System.out.printf("買到 %s\n", data1);
        String data2 = task2.get();
        System.out.printf("買到 %s\n", data2);
        System.out.printf("製作 %s\n", (data1 + data2));
    }
}
