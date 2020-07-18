package com.lab.ocp.day15.game;

import java.util.Random;
import java.util.Scanner;

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
                if (tname.equals("pc")) { // PC
                    number.pcGuess();
                } else { // User
                    number.userGuess();
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }

    }

}
