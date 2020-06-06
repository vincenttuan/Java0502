package com.lab.ocp.day08.clothes;

public class SmallTShirt extends TShirt {
    private Integer price;
    private Integer amount;

    public SmallTShirt(Integer price, Integer amount) {
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
