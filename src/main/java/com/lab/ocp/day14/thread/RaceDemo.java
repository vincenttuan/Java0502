package com.lab.ocp.day14.thread;

class Race implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<=100_0000;i++); // 跑步過程(所花的時間)
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 到達終點\n", tName);
    }
}

public class RaceDemo {
    public static void main(String[] args) {
        Race race = new Race();
        Thread t1 = new Thread(race, "兔子");
        Thread t2 = new Thread(race, "烏龜");
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
