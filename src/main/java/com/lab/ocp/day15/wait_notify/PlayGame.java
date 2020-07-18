package com.lab.ocp.day15.wait_notify;

public class PlayGame {
    public static void main(String[] args) {
        Cookie cookie = new Cookie();
        Thread t1 = new Thread(new Put(cookie), "主人");
        Thread t2 = new Thread(new Eat(cookie), "小狗");
        t1.start();
        t2.start();
    }
}
