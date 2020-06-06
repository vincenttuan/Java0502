package com.lab.ocp.day08.clothes;

public class LargePants extends Pants {
    private Integer price;
    private Integer amount;

    public LargePants(Integer price, Integer amount) {
        this.price = price;
        this.amount = amount;
    }
    
    @Override
    public String getSize() {
        return "L";
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
