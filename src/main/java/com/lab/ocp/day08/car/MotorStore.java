package com.lab.ocp.day08.car;

import java.util.Arrays;

public class MotorStore {
    public static void main(String[] args) {
        Motor b1 = new BMW();
        Motor b2 = new BMW();
        Motor b3 = new Banz();
        Motor b4 = new Banz();
        Motor b5 = new Motorcycle();
        Motor b6 = new Motorcycle();
        Motor b7 = new Motorcycle();
        Motor[] motors = {b1, b2, b3, b4, b5, b6, b7};
        // 求 汽車/摩托車總價各是多少 ?
        int sum_car = Arrays.stream(motors)
                .filter(m -> m instanceof Car)
                .mapToInt(m -> m.getPrice())
                .sum();
        int sum_motocycle = Arrays.stream(motors)
                .filter(m -> m.getKind().equals("摩托車"))
                .mapToInt(m -> m.getPrice())
                .sum();
        System.out.printf("汽車總價: $%,d 摩托車總價: $%,d\n", sum_car, sum_motocycle);
    }
}
