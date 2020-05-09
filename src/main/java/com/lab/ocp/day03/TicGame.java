package com.lab.ocp.day03;

// 井字遊戲對戰
public class TicGame {
    public static void main(String[] args) {
        char[] c = new char[9];
        c[0]='O';c[2]='X';c[3]='X';c[4]='O';c[8]='O';
        print(c);
        winner(c);
    }
    
    public static void print(char [] c) {
        for(int i=0;i<c.length;i++) {
            System.out.print(c[i] + "\t");
            if(i % 3 == 2) {
                System.out.println();
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
        } else if(c[0] + c[1] + c[2] == 'X' * 3 || 
           c[3] + c[4] + c[5] == 'X' * 3 || 
           c[6] + c[7] + c[8] == 'X' * 3 || 
           c[0] + c[3] + c[6] == 'X' * 3 || 
           c[1] + c[4] + c[7] == 'X' * 3 || 
           c[2] + c[5] + c[8] == 'X' * 3 || 
           c[0] + c[4] + c[8] == 'X' * 3 || 
           c[2] + c[4] + c[6] == 'X' * 3 ) {
            System.out.println("Winner: X");
        } 
    }
    
}
