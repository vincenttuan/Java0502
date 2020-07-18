package com.lab.ocp.day15.wait_notify;

public class Cookie {
    
    public synchronized void put(int num) {
        System.out.printf("主人放第 %d 塊餅乾\n", num);
    }
    
    public synchronized void eat(int num) {
        System.out.printf("小狗吃第 %d 塊餅乾\n", num);
    }
}
