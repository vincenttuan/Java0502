package com.lab.ocp.day05;

public class Hamburger {
    private String name; // 物件屬性
    private int price; // 物件屬性
    
    // 建構子
    public Hamburger() {
    
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
}
