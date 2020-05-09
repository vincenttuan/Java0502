package com.lab.ocp.day03;

public class MultiArrayGame {
    public static void main(String[] args) {
        char[][] g = new char[3][3];
        g[0][0] = 'O';
        g[0][2] = 'X';
        g[2][2] = 'O';
        g[1][1] = 'X';
        print(g);
        g[2][0] = 'O';
        print(g);
    }
    public static void print(char[][] g) {
        for(int i=0;i<g.length;i++) {
            for(int j=0;j<g[i].length;j++) {
                System.out.print(g[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
}
