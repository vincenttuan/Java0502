package com.lab.ocp.day06;

public class Hamburger extends Food {

    public Hamburger() {
    }

    public Hamburger(String name, int price) {
        super(name, price);
    }
    
    // 業務方法
    public void cook() {
        System.out.println(getName() + " 的做法");
        String food = "";
        switch(getName()) {
            case "大麥克":
                food = "牛肉";
                break;
            case "麥香魚":
                food = "鱈魚";
                break;    
        }
        System.out.println("1.放麵包");
        System.out.println("2.放" + food);
        System.out.println("3.放醬料");
        System.out.println("4.包裝");
        System.out.println("----------------------");
    }
    
}
