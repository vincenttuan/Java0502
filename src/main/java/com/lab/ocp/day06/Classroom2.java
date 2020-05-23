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
        // 切割資料 I (每一筆)
        String[] rows = data.split("\r\n");
        System.out.println(rows[0]);
        // 切割資料 II (每一欄)
        String[] row = rows[0].split(",");
        System.out.println(row[0]); // 學生姓名
        System.out.println(row[1]); // 考試代號/名稱
        System.out.println(row[2]); // 考試分數
        
        // 建立考試成績物件
        Exam exam = new Exam();
        exam.setName(row[1]);
        exam.setScore(Integer.parseInt(row[2])); // 要透過字串轉數字
        // 建立學生物件
        Student student = new Student();
        student.setName(row[0]);
        student.setExam(exam);
        System.out.println(student);
    }
}
