package com.lab.ocp.day15.barrier.car;

import java.util.concurrent.CyclicBarrier;

public class CarPlay {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3);
        for(int i=1;i<=3;i++) {
            Car car = new Car(cb);
            car.start();
        }
        
    }
}
