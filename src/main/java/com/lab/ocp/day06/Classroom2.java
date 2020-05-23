package com.lab.ocp.day06;

import java.io.File;
import java.util.Scanner;

public class Classroom2 {
    public static void main(String[] args) throws Exception {
        // 抓取 javaexam.csv 的資料
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day06\\javaexam.csv");
        Scanner sc = new Scanner(file);
        String data = sc.useDelimiter("\\A").next();
        //System.out.println(data);
        String[] rows = data.split("\r\n");
        System.out.println(rows[0]);
        String[] row = rows[0].split(",");
        System.out.println(row[0]);
        System.out.println(row[1]);
        System.out.println(row[2]);
    }
}
