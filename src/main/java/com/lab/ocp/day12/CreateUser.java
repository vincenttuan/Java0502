package com.lab.ocp.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateUser {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ocp?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String user = "root";
        String password = "12345678";
        String sql = "INSERT INTO user(name, password) VALUES (?, ?)";
        try(Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);) {
                
            pstmt.setString(1, "vincent");
            EncrypDES des = new EncrypDES();
            pstmt.setBytes(2, des.Encrytor("1234"));
            int rowCount = pstmt.executeUpdate();
            System.out.println("新增異動筆數: " + rowCount);
            
        } catch (Exception e) {
        }
        
    }
}
