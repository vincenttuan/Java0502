package com.lab.ocp.day15.wait_notify;

public class Cookie {
    private boolean empty = true; // 空盤子
    public synchronized void put(int num) throws InterruptedException {
        if(!empty) {
            wait();
        }
        System.out.printf("主人放第 %d 塊餅乾\n", num);
        empty = false;
        notify();
    }
    
    public synchronized void eat(int num) throws InterruptedException {
        if(empty) {
            wait();
        }
        System.out.printf("小狗吃第 %d 塊餅乾\n", num);
        empty = true;
        notify();
    }
}
