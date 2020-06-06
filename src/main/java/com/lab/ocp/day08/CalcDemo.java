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
        
        Calc div = (x, y) -> x / y  ;
        
        Calc max = (x, y) -> Math.max(x, y);
        
        Calc max2 = Math::max; // :: 稱為方法參考
        
        System.out.println(add.cal(10, 20));
        System.out.println(sub.cal(10, 20));
        System.out.println(mul.cal(10, 20));
        System.out.println(div.cal(10, 20));
        System.out.println(max.cal(10, 20));
        System.out.println(max2.cal(10, 20));
    }
}
