package com.lab.ocp.day07;

// 建構子關聯呼叫
class Father {

    public Father() {
        this(0);
        System.out.println("C");
    }
    
    public Father(int x) {
        System.out.println("D");
    }
}
class Son extends Father {
    public Son() {
        this(0);
        System.out.println("A");
    }
    public Son(int x) {
        super();
        System.out.println("B");
    }
}
public class ConstructorRefDemo {
    public static void main(String[] args) {
        Son son = new Son();
    }
            
}
