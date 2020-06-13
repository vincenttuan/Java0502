package com.lab.ocp.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.stream.IntStream;

public class Select {
    public static void main(String[] args) throws Exception {
        //Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/ocp?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String username = "root";
        String password = "12345678";
        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println(!conn.isClosed());
        
        Statement stmt = conn.createStatement();
        String sql = "SELECT e.emp_name, e.emp_username, e.emp_password FROM employee e";
        ResultSet rs = stmt.executeQuery(sql);
        ResultSetMetaData md = rs.getMetaData();
        System.out.printf("%-10s%-20s%-15s\n", md.getColumnName(1), md.getColumnName(2), md.getColumnName(3));
        IntStream.rangeClosed(1, 45).forEach(i -> System.out.print("-"));
        System.out.println();
        while (rs.next()) {            
            String empName     = rs.getString("emp_name");
            String empUsername = rs.getString("emp_username");
            String empPassword = rs.getString("emp_password");
            System.out.printf("%-10s%-20s%-15s\n", empName, empUsername, empPassword);
        }
        rs.close();
        stmt.close();
        conn.close();
    }
}
