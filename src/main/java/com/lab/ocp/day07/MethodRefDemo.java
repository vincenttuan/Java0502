package com.lab.ocp.day07;

class Foo {
    public void play() {
        System.out.println("Baseball");
    }
}

class Bar extends Foo {
    public void play() {
        System.out.println("Basketball");
        super.play();
    }
}

public class MethodRefDemo {
    public static void main(String[] args) {
        Bar bar = new Bar();
        bar.play();
    }
}
