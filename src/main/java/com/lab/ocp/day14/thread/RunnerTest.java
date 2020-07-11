package com.lab.ocp.day14.thread;

public class RunnerTest {
    public static void main(String[] args) {
        Runner r1 = new Runner();
        Runner r2 = new Runner();
        r1.job();
        r2.job();
    }
}
