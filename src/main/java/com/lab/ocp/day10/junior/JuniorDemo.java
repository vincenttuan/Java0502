package com.lab.ocp.day10.junior;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JuniorDemo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src\\main\\java\\com\\lab\\ocp\\day10\\junior\\junior.txt");
        List<Junior> list = new ArrayList<>();
        Files.lines(path).forEach(record -> {
            String[] rows = record.split(",");
            Junior junior = new Junior();
            junior.setSchool(rows[0].trim());
            junior.setAmount(Integer.parseInt(rows[1].trim()));
            junior.setScore(Double.parseDouble(rows[2].trim()));
            list.add(junior);
        });
        System.out.println(list);
    }
}
