package com.lab.ocp.day15;

public class BallGamePlay {
    public static void main(String[] args) {
        BallGame ballGame = new BallGame(); // 資源
        Thread t1 = new Thread(ballGame, "Mary");
        //Thread t2 = new Thread(ballGame, "John");
        t1.start();
        //t2.start();
    }
}
