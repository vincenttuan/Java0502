package com.lab.ocp.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Select {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/ocp?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String username = "root";
        String password = "12345678";
        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println(!conn.isClosed());
        
    }
}
