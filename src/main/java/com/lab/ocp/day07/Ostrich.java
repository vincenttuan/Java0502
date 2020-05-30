package com.lab.ocp.day07;

public class Ostrich extends Bird {

    @Override
    public void move() {
        System.out.println("走");
    }
    
    void motto() { // 座右銘
        System.out.println("鴕鳥精神");
    }
    
}
