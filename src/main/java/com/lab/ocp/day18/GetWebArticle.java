package com.lab.ocp.day18;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GetWebArticle {
    public static void main(String[] args) {
        String path = "https://udn.com/news/story/12681/4746513?from=udn_ch2_menu_v2_main_index";
        try(InputStream is = new URL(path).openStream();) {
            byte[] data = new byte[is.available()];
            is.read(data);
            String html = new String(data, "utf-8");
            Document doc = Jsoup.parse(html);
            String title = doc.select("meta[property=\"og:title\"]").attr("content");
            String content = doc.select("meta[property=\"og:description\"]").attr("content");
            System.out.println(title);
            System.out.println(content);
            File file = new File("src\\main\\java\\com\\lab\\ocp\\day18\\" + title + ".txt");
            try(FileWriter fw = new FileWriter(file)) {
                fw.write(content);
                System.out.println("寫入完成");
            } catch (Exception e) {
            }
            
        } catch (Exception e) {
        }
    }
}
