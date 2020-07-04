package com.lab.ocp.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginUser {

    public static void main(String[] args) {
        try {
            boolean logincheck = login("vincent", "1234");
            System.out.println(logincheck);
        } catch (LoginException ex) {
            System.out.println("登入錯誤訊息: " + ex.getMessage());
            ex.how2Do();
        }
    }

    public static boolean login(String name, String pass) throws LoginException {
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
                if (user_pass.equals(pass)) {
                    return true;
                } else {
                    LoginException le = new LoginException("密碼錯誤");
                    throw le;
                }
            } else {
                LoginException le = new LoginException("查無此人");
                throw le;
            }

        } catch (Exception e) {
            LoginException le = new LoginException(e.getMessage());
            throw le;
        }
    }
}

