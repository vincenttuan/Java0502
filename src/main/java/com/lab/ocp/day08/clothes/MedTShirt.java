package com.lab.ocp.day08.clothes;

public class MedTShirt extends TShirt {
    private Integer price;
    private Integer amount;

    public MedTShirt(Integer price, Integer amount) {
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
