package com.lab.ocp.day15.barrier;

import java.util.concurrent.CyclicBarrier;

public class CarPlay2 {
    public static void main(String[] args) {
        int parties = 3;
        int amount = 6;
        CyclicBarrier cb = new CyclicBarrier(parties);
        for(int i=1;i<=amount;i++) {
            Car car = new Car(cb);
            car.start();
        }
        
    }
}
