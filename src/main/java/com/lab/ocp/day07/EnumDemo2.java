package com.lab.ocp.day07;

enum TWCurrency {
    一元(1), 伍元(5), 拾元(10), 一百元(100), 
    二百元(200), 伍佰元(500), 一千元(1000), 二千元(2000);
    
    int value;

    private TWCurrency(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
}

public class EnumDemo2 {
    public static void main(String[] args) {
        TWCurrency twc1 = TWCurrency.二百元;
        TWCurrency twc2 = TWCurrency.二千元;
        System.out.println(twc1.getValue() + twc2.getValue());
    }
}
