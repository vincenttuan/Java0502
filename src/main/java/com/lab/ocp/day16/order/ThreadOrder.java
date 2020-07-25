package com.lab.ocp.day16.order;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Job implements Callable<Boolean> {
    private String name;

    public Job(String name) {
        this.name = name;
    }
    
    @Override
    public Boolean call() throws Exception {
        Thread.sleep(1000);
        Scanner sc = new Scanner(System.in);
        System.out.print(name + " 請猜一數字:");
        if(sc.nextInt() == 77) return false;
        return true;
    }
}

public class ThreadOrder {
    public static void main(String[] args) throws Exception {
        Callable[] cs = {new Job("John"), new Job("Mary"), new Job("PC")};
        for(int i=0;;i=++i%cs.length) {
            FutureTask<Boolean> task = new FutureTask(cs[i]);
            new Thread(task).start();
            boolean value = task.get();
            if(value == false) break;
        }
    }
}
