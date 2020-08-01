package com.lab.ocp.day18;

import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\lab\\ocp\\day18\\data.txt";
        try(FileReader fr = new FileReader(path)) {
            
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char)data);
            }
            
        } catch (Exception e) {
        }
    }
}
