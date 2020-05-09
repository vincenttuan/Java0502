package com.lab.ocp.day03;

// 井字遊戲對戰

import java.util.Random;
import java.util.Scanner;

public class TicGame {
    public static void main(String[] args) {
        char[] c = new char[9];
        do {            
            Scanner sc = new Scanner(System.in);
            System.out.print("請選擇位置(0~8): ");
            int pos = sc.nextInt();
            if(c[pos] == '\u0000') {
                c[pos] = 'O';
                pcRun(c); // 電腦執行
                print(c);
                winner(c);
            } else {
                System.out.println("此位置不可選擇");
            }
            
        } while (true);
        
        
    }
    
    public static void pcRun(char [] c) {
        while (true) {            
            int pos = new Random().nextInt(c.length);
            if(c[pos] == '\u0000') {
                c[pos] = 'X';
                break;
            }
        }
    }
    
    public static void print(char [] c) {
        for(int i=0;i<c.length;i++) {
            System.out.print(c[i] + "\t");
            if(i % 3 == 2) {
                System.out.println();
                if(i != 8) {
                    System.out.println("------------------");
                }
            }
        }
    }
    
    public static void winner(char [] c) {
        if(c[0] + c[1] + c[2] == 'O' * 3 || 
           c[3] + c[4] + c[5] == 'O' * 3 || 
           c[6] + c[7] + c[8] == 'O' * 3 || 
           c[0] + c[3] + c[6] == 'O' * 3 || 
           c[1] + c[4] + c[7] == 'O' * 3 || 
           c[2] + c[5] + c[8] == 'O' * 3 || 
           c[0] + c[4] + c[8] == 'O' * 3 || 
           c[2] + c[4] + c[6] == 'O' * 3 ) {
            System.out.println("Winner: O");
            System.exit(0);
        } else if(c[0] + c[1] + c[2] == 'X' * 3 || 
           c[3] + c[4] + c[5] == 'X' * 3 || 
           c[6] + c[7] + c[8] == 'X' * 3 || 
           c[0] + c[3] + c[6] == 'X' * 3 || 
           c[1] + c[4] + c[7] == 'X' * 3 || 
           c[2] + c[5] + c[8] == 'X' * 3 || 
           c[0] + c[4] + c[8] == 'X' * 3 || 
           c[2] + c[4] + c[6] == 'X' * 3 ) {
            System.out.println("Winner: X");
            System.exit(0);
        } 
    }
    
}
