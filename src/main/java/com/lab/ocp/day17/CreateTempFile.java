package com.lab.ocp.day17;

import java.io.File;

public class CreateTempFile {
    public static void main(String[] args) throws Exception {
        File path = new File("src\\main\\java\\com\\lab\\ocp\\day17\\temp");
        if (!path.exists()) { // 該目錄是否存在
            path.mkdir(); // 建立資料夾
        }
        File tempFile = File.createTempFile("temp", ".txt", path);
        System.out.println(tempFile.exists());
    }
}
