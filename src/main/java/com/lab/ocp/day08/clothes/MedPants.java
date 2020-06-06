package com.lab.ocp.day08.clothes;

public class MedPants extends Pants {
    private Integer price;
    private Integer amount;

    public MedPants(Integer price, Integer amount) {
        this.price = price;
        this.amount = amount;
    }
    
    @Override
    public String getSize() {
        return "M";
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
