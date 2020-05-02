package com.lab.ocp.day01;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Account acc = new Account();
        menu(acc);
    }
    
    public static void menu(Account acc) {
        System.out.println("--------------------");
        System.out.println("1. 設定帳戶名稱");
        System.out.println("2. 帳戶存款");
        System.out.println("3. 帳戶提款");
        System.out.println("4. 餘額查詢");
        System.out.println("5. 離開 Exit");
        System.out.println("--------------------");
        System.out.println("請選擇服務項目(1~5):");
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt(); // 取得使用者輸入的數值
        switch(item) {
            case 1: // 1. 設定帳戶名稱
                System.out.println("請輸入帳戶名稱:");
                String name = sc.next(); // 取得使用者輸入的帳戶名稱
                acc.setName(name); // 設定使用者帳戶名稱
                break;
            case 2:
                break;
            case 3:
                break;
            case 4: // 4. 餘額查詢
                acc.print(); // 印出帳戶資訊
                break;
            case 5:
                return;
        }
        menu(acc);
    }
    
}
