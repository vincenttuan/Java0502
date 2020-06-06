package com.lab.ocp.day08.mask;

public class ChildMask extends Mask {

    public ChildMask() {
        super("S");
    }

    @Override
    public Integer getPrice() {
        return 6;
    }
    
}
