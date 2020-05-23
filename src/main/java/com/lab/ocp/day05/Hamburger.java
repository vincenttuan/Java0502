package com.lab.ocp.day05;

public class Hamburger {
    private String name; // 物件屬性
    private int price; // 物件屬性
    
    // 建構子
    public Hamburger() {
    
    }
    
    public Hamburger(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    
    // 封裝屬性
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    // 業務方法
    public void cook() {
        System.out.println(name + " 的做法");
        String food = "";
        switch(name) {
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
    
    @Override // 覆寫方法
    public String toString() {
        String data = String.format("name: %s price: %d", name, price);
        return data;
    }
}
