package com.lab.ocp.day01;

public class Account {
    String name; // 帳戶名
    int balance; // 帳戶餘額
    
    void print() { // 列印帳戶資訊
        System.out.printf("%s 帳戶餘額: $%,d\n", name, balance);
    }
}
