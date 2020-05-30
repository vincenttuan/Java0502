package com.lab.ocp.day07;

import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Tiger tiger = new Tiger();
        Ostrich ostrich = new Ostrich();
        move(ostrich);
    }
    public static void move(Animal animal) {
        animal.move();
    }
    public static Animal getAnimal() {
        int n = new Random().nextInt(5);
        switch(n) {
            case 1:
                return new Tiger();
            case 2:
                return new Fish();
            case 3:
                return new Bird();
            case 4:
                return new Ostrich();    
        }
        return new Animal();
    }
}
