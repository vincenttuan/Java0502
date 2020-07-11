package com.lab.ocp.day13;

import java.util.stream.IntStream;

class BigData {
    StringBuffer sb;
    {
        sb = new StringBuffer();
        IntStream.rangeClosed(1, 3000_0000)
                .forEach((i) -> sb.append(i));
    }

    @Override
    protected void finalize() throws Throwable {
        String tname = Thread.currentThread().getName();
        System.out.println(tname);
        System.out.println("BigData 功成身退, 被回收了");
    }
    
}

public class GCDemo {
    public static void main(String[] args) {
        String tname = Thread.currentThread().getName();
        System.out.println(tname);
        long free = Runtime.getRuntime().freeMemory();
        System.out.printf("free: %d bytes\n", free);
        System.gc();
        free = Runtime.getRuntime().freeMemory();
        System.out.printf("free: %d bytes\n", free);
        BigData bigData = new BigData();
        free = Runtime.getRuntime().freeMemory();
        System.out.printf("free: %d bytes\n", free);
        bigData = null;
        System.gc();
        System.out.println("其他處理邏輯");
        free = Runtime.getRuntime().freeMemory();
        System.out.printf("free: %d bytes\n", free);
    }
}
