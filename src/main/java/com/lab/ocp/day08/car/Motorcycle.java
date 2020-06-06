package com.lab.ocp.day08.car;

public class Motorcycle implements Motor {

    @Override
    public String getKind() {
        return "摩托車";
    }

    @Override
    public Integer getPrice() {
        return 70000;
    }
    
}
