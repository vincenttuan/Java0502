package com.lab.ocp.day18;

import java.io.InputStream;
import java.net.URL;

public class GetWebArticle {
    public static void main(String[] args) {
        String path = "https://udn.com/news/story/12681/4746513?from=udn_ch2_menu_v2_main_index";
        try(InputStream is = new URL(path).openStream()) {
            
            byte[] data = new byte[is.available()];
            is.read(data);
            System.out.print(new String(data, "utf-8"));
        } catch (Exception e) {
        }
    }
}
