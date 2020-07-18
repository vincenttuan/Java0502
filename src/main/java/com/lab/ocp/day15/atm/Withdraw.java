package com.lab.ocp.day15.atm;

public class Withdraw implements Runnable {
    private Account account;
    private int money;

    public Withdraw(Account account, int money) {
        this.account = account;
        this.money = money;
    }
    
    @Override
    public void run() {
        // 模擬去銀行的時間
        for(int i=0;i<Integer.MAX_VALUE;i++);
        account.widthdraw(money);
    }
    
}
