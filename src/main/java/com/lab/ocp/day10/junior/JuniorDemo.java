package com.lab.ocp.day10.junior;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JuniorDemo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src\\main\\java\\com\\lab\\ocp\\day10\\junior\\junior.txt");
        Files.lines(path).forEach(System.out::println);
    }
}
