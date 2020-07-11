package com.lab.ocp.day13;

import java.util.stream.IntStream;

class BigData {
    StringBuffer sb;
    {
        sb = new StringBuffer();
        IntStream.rangeClosed(1, 3000_0000)
                .forEach((i) -> sb.append(i));
    }
}

public class GCDemo {
    public static void main(String[] args) {
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
        BigData bigData2 = new BigData();
        free = Runtime.getRuntime().freeMemory();
        System.out.printf("free: %d bytes\n", free);
    }
}
