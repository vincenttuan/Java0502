package com.lab.ocp.day01;

public class Account {
    String name; // 帳戶名
    private int balance; // 帳戶餘額
    
    void deposit(int money) { // 存款
        if(money > 0) {
            balance += money;
        } else {
            System.out.printf("存款金額錯誤: %d\n", money);
        }
    }
    
    void print() { // 列印帳戶資訊
        System.out.printf("%s 帳戶餘額: $%,d\n", name, balance);
    }
}
