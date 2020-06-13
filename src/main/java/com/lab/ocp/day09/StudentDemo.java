package com.lab.ocp.day09;

import com.google.gson.Gson;
import java.io.File;
import java.util.Scanner;
import java.util.Set;

public class StudentDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day09\\exams.json");
        String json = new Scanner(file).useDelimiter("\\A").next();
        Gson gson = new Gson();
        Set<Student> students = gson.fromJson(json, Set.class);
        System.out.println(students);
        
        // 請求出每人的總分各是多少 ?
        
        // 請求出總分最高的人名 ?
        
        
    }
}
