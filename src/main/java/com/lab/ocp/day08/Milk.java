package com.lab.ocp.day08;

public class Milk implements Drink {
    private String name;
    private Integer price;

    public Milk(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Milk() {
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getPrice() {
        return price;
    }
    
    @Override
    public void setPrice(Integer price) {
        this.price = price;
    }
    
}
