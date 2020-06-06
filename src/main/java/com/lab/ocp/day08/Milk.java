package com.lab.ocp.day08;

public class Milk implements Drink {
    private String name;
    private Integer price;
    
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
