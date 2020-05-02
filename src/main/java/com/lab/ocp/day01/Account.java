package com.lab.ocp.day01;

public class Account {
    String name; // 帳戶名
    private int balance; // 帳戶餘額
    
    void deposit(int money) { // 存款
        if(money > 0) {
            System.out.printf("存款金額: %,d\n", money);
            balance += money;
        } else {
            System.out.printf("存款金額錯誤: %d\n", money);
        }
        print(); // 印出帳戶資料
    }
    
    void withdraw(int money) { // 提款
        if(money > 0) {
            System.out.printf("提款金額: %,d\n", money);
            if(balance >= money) {
                balance -= money;
            } else {
                System.out.println("帳戶餘額不足");
            }
        } else {
            System.out.printf("提款金額錯誤: %d\n", money);
        }
        print(); // 印出帳戶資料
    }
    
    void print() { // 列印帳戶資訊
        System.out.printf("%s 帳戶餘額: $%,d\n", name, balance);
    }
}
