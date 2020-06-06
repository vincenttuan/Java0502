package com.lab.ocp.day08.clothes;

public class SmallPants extends Pants {
    private Integer price;
    private Integer amount;

    public SmallPants(Integer price, Integer amount) {
        this.price = price;
        this.amount = amount;
    }
    
    @Override
    public String getSize() {
        return "S";
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public Integer getAmount() {
        return amount;
    }
    
    
}
