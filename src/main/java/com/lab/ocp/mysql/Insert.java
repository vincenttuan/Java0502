package com.lab.ocp.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入員工編號(emp_no): ");
        String empNo = sc.next();
        System.out.print("請輸入員工姓名(emp_name): ");
        String empName = sc.next();
        System.out.print("請輸入員工登入帳號(emp_username): ");
        String empUsername = sc.next();
        System.out.print("請輸入員工登入密碼(emp_password): ");
        String empPassword = sc.next();
        
        String url = "jdbc:mysql://localhost:3306/ocp?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String username = "root";
        String password = "12345678";
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "INSERT INTO employee(emp_no, emp_name, emp_active, emp_username, emp_password) " +
                     "VALUES(?, ?, true, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, empNo);
        pstmt.setString(2, empName);
        pstmt.setString(3, empUsername);
        pstmt.setString(4, empPassword);
        int rowcount = pstmt.executeUpdate();
        System.out.printf("新增異動筆數: %d\n", rowcount);
        
                
    }
}
