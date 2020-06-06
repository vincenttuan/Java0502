package com.lab.ocp.day08;

public class CalcDemo {
    public static void main(String[] args) {
        Calc add = new Calc(){
            @Override
            public double cal(double x, double y) {
                return x + y;
            }
        };
        Calc sub = new Calc(){
            @Override
            public double cal(double x, double y) {
                return x - y;
            }
        };
        
        Calc mul = (double x, double y) -> {return x * y;};
        
        System.out.println(add.cal(10, 20));
        System.out.println(sub.cal(10, 20));
        System.out.println(mul.cal(10, 20));
    }
}
