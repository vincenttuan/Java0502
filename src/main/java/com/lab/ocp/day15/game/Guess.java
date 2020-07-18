package com.lab.ocp.day15.game;

public class Guess {
    
    public static boolean gameover = false;
    private int ans = 77;
    private boolean isUser = true; // User 先猜
    
    public synchronized void userGuess(int num) throws Exception {
        while(!isUser) {
            wait();
            if(gameover) return;
        }
        if(num == ans) {
            System.out.println("User 答對了");
            gameover = true;
        }
        isUser = false;
        notifyAll();
    }
    
    public synchronized void pcGuess(int num) throws Exception {
        while(isUser) {
            wait();
            if(gameover) return;
        }
        if(num == ans) {
            System.out.println("PC 答對了");
            gameover = true;
        }
        isUser = true;
        notifyAll();
    }
    
}
