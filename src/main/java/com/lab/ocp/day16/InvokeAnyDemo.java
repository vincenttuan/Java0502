package com.lab.ocp.day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAnyDemo {
    public static void main(String[] args) throws Exception {
        List<Callable<Integer>> list = new ArrayList<>();
        list.add(()->new Random().nextInt(9)+1);
        list.add(()->new Random().nextInt(9)+1);
        list.add(()->new Random().nextInt(9)+1);
        list.add(()->new Random().nextInt(9)+1);
        list.add(()->new Random().nextInt(9)+1);
        
        ExecutorService service = Executors.newCachedThreadPool();
        Integer num = service.invokeAny(list);
        System.out.println(num);
        service.shutdown();
    }
}
