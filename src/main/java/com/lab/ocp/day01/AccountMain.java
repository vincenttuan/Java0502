package com.lab.ocp.day01;

// ATM 主程式
public class AccountMain {
    public static void main(String[] args) {
        Account acct = new Account();
        acct.name = "Vincent";
        acct.deposit(10_0000);
        acct.withdraw(6_0000);
        acct.withdraw(6_0000);
    }
}
