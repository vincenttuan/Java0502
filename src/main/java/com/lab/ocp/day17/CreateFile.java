package com.lab.ocp.day17;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) throws Exception {
        String path = "src\\main\\java\\com\\lab\\ocp\\day17\\data.txt";
        File file = new File(path);
        if(file.exists()) {
            System.out.println("檔案已存在!");
        } else {
            boolean pass = file.createNewFile();
            if(pass)
                System.out.println("建立新檔成功");
            else 
                System.out.println("建立新檔失敗");
        }
    }
}
