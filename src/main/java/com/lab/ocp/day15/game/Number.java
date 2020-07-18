package com.lab.ocp.day15.game;

import java.util.Random;
import java.util.Scanner;

public class Number {
    
    public static boolean gameover = false;
    private int ans = new Random().nextInt(99) + 1;
    private boolean isUser = true; // User 先猜
    public int min = 0;
    public int max = 100;
    
    public synchronized void userGuess() throws Exception {
        while(!isUser) {
            wait();
        }
        if(gameover) return;
        System.out.printf("User 需在 %d ~ %d 之間猜一數字: \n", min, max);
        //int num = new Random().nextInt(max - min - 1) + min + 1;
        int num = new Scanner(System.in).nextInt();
        System.out.printf("User 猜: %d\n", num);
        if(num > min && num < max) {
            if(num == ans) {
                System.out.println("User 答對了");
                gameover = true;
            } else if(num > ans) {
                max = num;
            } else {
                min = num;
            }
            isUser = false;
            notifyAll();
        } else {
            System.out.println("範圍錯誤, 請重新輸入!");
            userGuess();
        }
    }
    
    public synchronized void pcGuess() throws Exception {
        while(isUser) {
            wait();
        }
        if(gameover) return;
        System.out.printf("PC 需在 %d ~ %d 之間猜一數字: \n", min, max);
        int num = new Random().nextInt(max - min - 1) + min + 1;
        System.out.printf("PC 猜: %d\n", num);
        if(num == ans) {
            System.out.println("PC 答對了");
            gameover = true;
        } else if(num > ans) {
            max = num;
        } else {
            min = num;
        }
        isUser = true;
        notifyAll();
    }
    
}
