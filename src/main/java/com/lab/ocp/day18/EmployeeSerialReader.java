package com.lab.ocp.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeSerialReader {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入員工姓名:");
        String name = sc.next();
        // 讀出序列物件
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day18\\bin\\" + name + ".bin");
        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            if (obj instanceof Employee) {
                Employee employee = (Employee) obj;
                System.out.printf("姓名: %s, 薪資: %d\n", employee.getName(), employee.getSalary());
            } else {
                System.out.println("物件錯誤");
            }
        } else {
            System.out.println("查無此人");
        }
    }
}
