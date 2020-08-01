package com.lab.ocp.day18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class GetWebImage {
    public static void main(String[] args) {
        // 網路來源
        String path = "https://uc.udn.com.tw/photo/2019/10/15/99/6943615.jpg";
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
