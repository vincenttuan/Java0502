package com.lab.ocp.day01;

public class Account {
    private String name; // 帳戶名
    private int balance; // 帳戶餘額
    
    boolean hasName() { // 有設定帳戶名嗎 ?
        return name != null ? true : false;
    }
    
    void setName(String name) {
        if(name != null && name.length() <= 10) {
            this.name = name;
        } else {
            System.out.printf("帳戶名稱輸入錯誤: %s\n", name);
        }
    }
    
    void deposit(int money) { // 存款
        if(!hasName()) {
            System.out.println("帳戶名不存在無法存款~");
            return; // 離開此方法
        }
        if(money > 0) {
            System.out.printf("存款金額: %,d\n", money);
            balance += money;
        } else {
            System.out.printf("存款金額錯誤: %d\n", money);
        }
        print(); // 印出帳戶資料
    }
    
    void withdraw(int money) { // 提款
        if(!hasName()) {
            System.out.println("帳戶名不存在無法提款~");
            return; // 離開此方法
        }
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
