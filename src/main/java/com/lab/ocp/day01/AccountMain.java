package com.lab.ocp.day01;

// 測試 Account 程式
public class AccountMain {
    public static void main(String[] args) {
        Account acct = new Account();
        acct.setName("Vincent");
        acct.deposit(10_0000);
        acct.withdraw(6_0000);
        acct.withdraw(6_0000);
        acct.print();
    }
}
