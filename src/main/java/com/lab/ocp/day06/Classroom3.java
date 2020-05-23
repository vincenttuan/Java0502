package com.lab.ocp.day06;

import java.io.File;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Classroom3 {

    public static void main(String[] args) throws Exception {
        // 1. 抓取 javaexam.csv 的資料
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day06\\javaexam.csv");
        Scanner sc = new Scanner(file);
        String data = sc.useDelimiter("\\A").next();
        // 2. 切割資料 I (每一筆)
        String[] rows = data.split("\r\n");
        // 3. 建立 Student[] 陣列, 資料筆數 = rows.length
        Student[] students = new Student[rows.length];
        // 4. 輪詢並切割欄位資料
        for (int i=0;i<rows.length;i++) {
            String[] row = rows[i].split(",");
            // 5. 建立考試成績物件
            Exam exam = new Exam();
            exam.setName(row[1]);
            exam.setScore(Integer.parseInt(row[2])); // 要透過字串轉數字
            // 6. 建立學生物件
            Student student = new Student();
            student.setName(row[0]);
            student.setExam(exam);
            //System.out.println(student);
            // 7. 將 student 物件加入到 students[] 陣列中
            students[i] = student;
        }
        // 8. 請顯示出 students 的分析統計資料
        IntSummaryStatistics stat = Arrays.stream(students)
                .mapToInt(s -> s.getExam().getScore())
                .summaryStatistics();
        System.out.println(stat);
        // 9. 最高分?是誰?
        for(Student student : students) {
            if(student.getExam().getScore() == stat.getMax()) {
                System.out.printf("%d %s\n", stat.getMax(), student.getName());
                break;
            }
        }
        // 9. 最高分?是誰? (Java 8)
        String name = Arrays.stream(students)
                        .filter(s -> s.getExam().getScore() == stat.getMax()) // 過濾資料
                        .findFirst() // 找到第一筆符合的
                        .get() // Student 物件
                        .getName(); // 取得人名
        System.out.printf("%d %s\n", stat.getMax(), name);
        
        // 10. 最低分?是誰?
        for(Student student : students) {
            if(student.getExam().getScore() == stat.getMin()) {
                System.out.printf("%d %s\n", stat.getMin(), student.getName());
                break;
            }
        }
        // 10. 最低分?是誰? (Java 8)
        String name2 = Arrays.stream(students)
                .filter(s -> s.getExam().getScore() == stat.getMin())
                .findFirst()
                .get()
                .getName();
        System.out.printf("%d %s\n", stat.getMin(), name2);
        System.out.println("----------------------------------------------");
        // 11. 通過此次考試的人名有 (>=65分)
        for(Student student : students) {
            if(student.getExam().getScore() >= 65) {
                System.out.printf("%d %s\n", student.getExam().getScore(), student.getName());
            }
        }
        Arrays.stream(students)
                .filter(s -> s.getExam().getScore() >= 65)
                .forEach(s -> System.out.printf("%d %s\n", s.getExam().getScore(), s.getName()));
        
    }
}
