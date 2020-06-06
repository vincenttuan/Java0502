package com.lab.ocp.day08.mask;

public abstract class Mask {
    private String size;

    public Mask(String size) {
        this.size = size;
    }
    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public abstract Integer getPrice();
    
}
