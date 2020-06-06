package com.lab.ocp.day08.mask;

import java.util.Arrays;

public class MaskStore {
    public static void main(String[] args) {
        Mask[] masks = {
            new AudltMask(),
            new AudltMask(),
            new AudltMask(),
            new AudltMask(),
            new AudltMask(),
            new ChildMask(),
            new ChildMask(),
            new ChildMask(),
            new ChildMask(),
            new ChildMask(),
        };
        int total = Arrays.stream(masks)
                .mapToInt(m -> m.getPrice())
                .sum();
        System.out.println(total);
        
        
    }
}
