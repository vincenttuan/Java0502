package com.lab.ocp.day16.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class SumMain {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ForkJoinPool fjp = new ForkJoinPool();
        Sum sum = new Sum(data, 0, data.length);
        fjp.invoke(sum);
    }
}
