package com.lab.ocp.day07;

// 建構子關聯呼叫
class Father {

    public Father() {
        System.out.println("C");
    }
    
    public Father(int x) {
        this();
        System.out.println("D");
    }
}
class Son extends Father {
    public Son() {
        super(10);
        System.out.println("A");
    }
    public Son(int x) {
        this();
        System.out.println("B");
    }
}
public class ConstructorRefDemo {
    public static void main(String[] args) {
        Son son = new Son(10);
    }
            
}
