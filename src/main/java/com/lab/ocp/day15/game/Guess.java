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
                int min = number.min;
                int max = number.max;
                System.out.printf("%d ~ %d 之間猜一數字: \n", min, max);
                if (tname.equals("pc")) {
                    int num = new Random().nextInt(max - min - 1) + min + 1;
                    number.pcGuess(num);
                } else {
                    int num = new Random().nextInt(max - min - 1) + min + 1;
                    number.userGuess(num);
                }
            }
        } catch (Exception e) {
        }

    }

}
