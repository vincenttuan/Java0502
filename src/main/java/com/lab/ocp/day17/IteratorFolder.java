package com.lab.ocp.day17;

import java.io.File;

public class IteratorFolder {
    public static void main(String[] args) {
        File path = new File("src\\main\\java\\com\\lab\\ocp\\day17");
        File[] files = path.listFiles();
        for(File file : files) {
            System.out.printf("%s 是%s\n", file.getName(), file.isDirectory()?"目錄":"檔案");
        }
    }
}
