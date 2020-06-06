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
        // 我要買 Audlt 3 個 與 Child 2 個要花多少錢 ?
        
    }
}
