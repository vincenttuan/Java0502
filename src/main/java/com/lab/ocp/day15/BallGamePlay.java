package com.lab.ocp.day15;

public class BallGamePlay {
    public static void main(String[] args) {
        BallGame ballGame = new BallGame(); // 資源
        Thread t1 = new Thread(ballGame, "Mary");
        Thread t2 = new Thread(ballGame, "John");
        Thread t3 = new Thread(ballGame, "Helen");
        Thread t4 = new Thread(ballGame, "Tom");
        Thread t5 = new Thread(ballGame, "Jo");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
