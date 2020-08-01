package com.lab.ocp.day18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class GetWebImage {
    public static void main(String[] args) {
        // 網路來源
        String path = "https://previews.123rf.com/images/popcar/popcar1511/popcar151100028/48549386-retro-car-.jpg";
        // 寫入檔案
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day18\\car.jpg");
        // InputStream 讀取串流
        // OutputStream 寫入串流, FileOutputStream 寫入串流到指定檔案
        try(InputStream is = new URL(path).openStream();
            FileOutputStream fos = new FileOutputStream(file);) {
            int data;
            while ((data = is.read()) != -1) {                
                fos.write(data);
            }
            System.out.println("寫入成功");
        } catch (Exception e) {
        }

    }
}
