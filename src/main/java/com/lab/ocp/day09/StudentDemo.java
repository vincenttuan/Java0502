package com.lab.ocp.day09;

import java.io.File;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day09\\exams.json");
        String json = new Scanner(file).useDelimiter("\\A").next();
        System.out.println(json);
    }
}
