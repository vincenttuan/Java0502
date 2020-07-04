package com.lab.ocp.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginUser {

    public static void main(String[] args) {
        boolean logincheck = login("vincent", "1234");
        System.out.println(logincheck);
    }

    public static boolean login(String name, String pass) {
        String url = "jdbc:mysql://localhost:3306/ocp?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String user = "root";
        String password = "12345678";
        String sql = "SELECT name, password FROM user WHERE name = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String user_pass = new String(new EncrypDES().Decryptor(rs.getBytes("password")));
                return user_pass.equals(pass);
            } else {
                System.out.println("查無此人");
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }
}

