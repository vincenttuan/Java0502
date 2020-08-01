package com.lab.ocp.day18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReadDemo {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day18\\data.txt");
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);) {
            
            String data;
            StringBuilder sb = new StringBuilder();
            while ((data = br.readLine()) != null) {
                sb.append(data).append("\n");
            }
            System.out.println(sb);
        } catch (Exception e) {
        }
    }
}
