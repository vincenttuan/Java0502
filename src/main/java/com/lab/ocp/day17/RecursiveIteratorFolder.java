package com.lab.ocp.day17;

import java.io.File;

public class RecursiveIteratorFolder {
    public static void main(String[] args) {
        File path = new File("src\\main\\java\\com\\lab\\ocp\\day17");
        list(path);
    }
    
    public static void list(File path) {
        File[] files = path.listFiles();
        for(File file : files) {
            System.out.printf("%s 是%s\n", file.getName(), file.isDirectory()?"目錄":"檔案");
            if(file.isDirectory()) {
                list(file);
            }
        }
    }
}
