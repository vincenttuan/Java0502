package com.lab.ocp.day08.car;

public abstract class Car implements Motor {

    @Override
    public String getKind() {
        return "汽車";
    }
    
}
