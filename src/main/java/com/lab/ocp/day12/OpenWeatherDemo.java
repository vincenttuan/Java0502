package com.lab.ocp.day12;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OpenWeatherDemo {
    private static String key = "a82e36203e1d003a2e10a186c5e939a3";
    private static String path = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";
    public static void main(String[] args) {
        printWeather("taoyuan");
    }
    
    public static void printWeather(String city) {
        try {
            path = String.format(path, city, key);
            //1. 建立 URL 物件
            URL url = new URL(path);
            //2. 取得 InputStream 串流資料
            InputStream is = url.openStream();
            //3. 取得 json 文字資料
            String json = new Scanner(is).useDelimiter("\\A").next();
            System.out.println(json);
        } catch (MalformedURLException ex) {
            System.out.println("網路路徑格式錯誤, 錯誤原因: " + ex);
        } catch (IOException ex) {
            System.out.println("串流資料擷取錯誤, 錯誤原因: " + ex);
        }
        
    }
}
