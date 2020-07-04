package com.lab.ocp.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadUser {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ocp?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String user = "root";
        String password = "12345678";
        String sql = "SELECT name, password FROM user";
        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql); ) {
                
            while(rs.next()) {
                String name = rs.getString("name");
                EncrypDES des = new EncrypDES();
                byte[] pass = des.Decryptor(rs.getBytes("password"));
                System.out.printf("%s\t%s\n", name, new String(pass));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
