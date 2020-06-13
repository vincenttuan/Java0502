package com.lab.ocp.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
        while (rs.next()) {            
            String empName     = rs.getString("emp_name");
            String empUsername = rs.getString("emp_username");
            String empPassword = rs.getString("emp_password");
            System.out.printf("%s\t%s\t%s\n", empName, empUsername, empPassword);
        }
        rs.close();
        stmt.close();
        conn.close();
    }
}
