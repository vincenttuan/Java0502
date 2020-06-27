package com.lab.ocp.day10.junior;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

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
        // Q1: 分數 22.2 校名 ?
        double score = 22.2;
        String school = "";
        Junior junior = list.stream()
                            .filter(j -> j.getScore() <= score)
                            .findFirst()
                            .get();
        System.out.println(junior);
        System.out.println("---------------------------------");
        // Q2: 排名第 2000 校名 ?
        int number = 8888;
        school = "";
        int amounts = 0;
        for(Junior j : list) {
            if(!(j.getSchool().contains("女"))) {
                amounts += j.getAmount();
                System.out.printf("%s amounts: %d\n", j.getSchool(), amounts);
                if(amounts >= number) {
                    System.out.println(j);
                    break;
                }
            }
        }
        System.out.println("---------------------------------");
        amounts = 0;
        for(Junior j : list) {
            if(!(j.getSchool().contains("建中")) && !(j.getSchool().contains("成功")) && !(j.getSchool().contains("男"))) {
                amounts += j.getAmount();
                System.out.printf("%s amounts: %d\n", j.getSchool(), amounts);
                if(amounts >= number) {
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}
