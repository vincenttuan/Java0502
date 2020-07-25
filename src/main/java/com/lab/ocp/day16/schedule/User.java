package com.lab.ocp.day16.schedule;

import java.util.Scanner;

public class User {
    static int guess = 0;
    public static void main(String[] args) {
        do {            
            Scanner sc = new Scanner(System.in);
            System.out.println("請下注(1~9):");
            guess = sc.nextInt();
            // 等待兌獎
            while (guess != 0) {                
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }
            }
        } while (true);
    }
}
