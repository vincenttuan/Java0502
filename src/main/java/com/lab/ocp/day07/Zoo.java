package com.lab.ocp.day07;

import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = getAnimal();
        System.out.println(animal.getClass());
        Tiger tiger = new Tiger();
        Ostrich ostrich = new Ostrich();
        move(tiger);
        //-----------------------------
        Animal o1 = new Ostrich();
        Ostrich o2 = new Ostrich();
        ((Ostrich)o1).motto();
        o2.motto();
    }
    public static void move(Animal animal) {
        animal.move();
        if(animal instanceof Ostrich) {
            ((Ostrich)animal).motto();
        } else {
            System.out.println("不可轉 Ostrich");
        }
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
