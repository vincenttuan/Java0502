package com.lab.ocp.day15.atm;

public class Account {
    private int balance; // 帳戶餘額

    public Account(int balance) {
        this.balance = balance;
    }
    
    public void print() { // 查詢帳戶餘額
        System.out.printf("帳戶餘額: %d\n", balance);
    }
    public void widthdraw(int money) { // 提款方法(提款金額=money)
        String tname = Thread.currentThread().getName(); // 提款人
        synchronized(this) {
            // 目前帳戶餘額
            int cur_balance = balance;
            // 模擬交易時間
            for(int i=0;i<Integer.MAX_VALUE;i++);
            if (cur_balance >= money) { // 帳戶餘額 >= 提款金額
                cur_balance -= money; // 進行扣款
                balance = cur_balance; // 回寫帳戶餘額
                System.out.printf("%s 提款 $%d 成功 帳戶餘額 $%d\n", tname, money, balance);
            } else {
                System.out.printf("%s 提款 $%d 失敗(餘額不足) 帳戶餘額 $%d\n", tname, money, balance);
            }
        }
    }
}
