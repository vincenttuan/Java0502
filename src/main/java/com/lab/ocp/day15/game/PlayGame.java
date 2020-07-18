package com.lab.ocp.day15.game;

public class PlayGame {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(new Guess(number), "user");
        Thread t2 = new Thread(new Guess(number), "pc");
        t1.start();
        t2.start();
    }
}
