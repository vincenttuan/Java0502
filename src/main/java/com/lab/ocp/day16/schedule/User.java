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
            System.out.println("等待兌獎, 兌獎完畢後按下Enter繼續");
            new Scanner(System.in).nextLine();
        } while (true);
    }
}
