package com.lab.ocp.day06;

import java.io.File;
import java.util.Scanner;

public class Classroom3 {

    public static void main(String[] args) throws Exception {
        // 抓取 javaexam.csv 的資料
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day06\\javaexam.csv");
        Scanner sc = new Scanner(file);
        String data = sc.useDelimiter("\\A").next();
        //System.out.println(data);
        // 切割資料 I (每一筆)
        String[] rows = data.split("\r\n");
        // 建立 Student[] 陣列, 資料筆數 = rows.length
        Student[] students = new Student[rows.length];
        for (int i=0;i<rows.length;i++) {
            String[] row = rows[i].split(",");
            // 建立考試成績物件
            Exam exam = new Exam();
            exam.setName(row[1]);
            exam.setScore(Integer.parseInt(row[2])); // 要透過字串轉數字
            // 建立學生物件
            Student student = new Student();
            student.setName(row[0]);
            student.setExam(exam);
            //System.out.println(student);
            // 將 student 物件加入到 students[] 陣列中
            students[i] = student;
        }
    }
}
