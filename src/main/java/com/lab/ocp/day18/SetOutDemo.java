package com.lab.ocp.day18;

import java.io.File;
import java.io.PrintStream;

public class SetOutDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day18\\log.txt");
        PrintStream out = new PrintStream(file);
        System.out.println("Hello");
        System.setOut(out);
        System.out.println("World");
        
    }
}
