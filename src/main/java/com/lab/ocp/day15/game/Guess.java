package com.lab.ocp.day15.game;

import java.util.Random;

public class Guess implements Runnable {

    private Number number;

    public Guess(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        try {
            while (!Number.gameover) {
                if (tname.equals("pc")) {
                    int num = new Random().nextInt(100);
                    number.pcGuess(num);
                } else {
                    int num = new Random().nextInt(100);
                    number.userGuess(num);
                }
            }
        } catch (Exception e) {
        }

    }

}
