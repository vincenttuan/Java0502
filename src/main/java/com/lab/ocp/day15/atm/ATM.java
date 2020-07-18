package com.lab.ocp.day15.atm;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000);
        Thread t1 = new Thread(new Withdraw(account, 6000), "小明");
        t1.start();
    }
}
