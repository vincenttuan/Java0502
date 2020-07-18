package com.lab.ocp.day15.atm;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000);
        Thread t1 = new Thread(new Withdraw(account, 6000), "小明");
        Thread t2 = new Thread(new Withdraw(account, 3000), "小華");
        Thread t3 = new Thread(new Withdraw(account, 2000), "小英");
        t1.start();
        t2.start();
        t3.start();
    }
}
