package com.lab.ocp.day12;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileOutputStream;
import java.io.FileWriter;
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
    private static String path_icon = "http://openweathermap.org/img/wn/%s.png";
    public static void main(String[] args) {
        printWeather("taoyuan,tw");
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
            //4. 利用 Gson 分析資料 -> root -> Json 根物件
            JsonObject root = new JsonParser().parse(json).getAsJsonObject();
            JsonObject main = root.getAsJsonObject("main");
            double temp = main.get("temp").getAsDouble() - 273.15;
            double feels_like = main.get("feels_like").getAsDouble() - 273.15;
            double humidity = main.get("humidity").getAsDouble();
            
            JsonArray weather = root.getAsJsonArray("weather");
            JsonObject wObj = weather.get(0).getAsJsonObject();
            String description = wObj.get("description").getAsString();
            String icon = wObj.get("icon").getAsString();
            
            System.out.printf("溫度: %.2f °C 體感: %.1f °C 濕度: %.1f %% (%s)\n", temp, feels_like, humidity, description);
            path_icon = String.format(path_icon, icon);
            System.out.println(path_icon);
            // 將 icon 圖片存檔
            InputStream is_icon = new URL(path_icon).openStream();
            FileOutputStream fos = new FileOutputStream("src/main/java/com/lab/ocp/day12/" + icon + ".png");
            byte[] bytes = new byte[is_icon.available()];
            is_icon.read(bytes);
            fos.write(bytes);
            
        } catch (MalformedURLException ex) {
            System.out.println("網路路徑格式錯誤, 錯誤原因: " + ex);
        } catch (IOException ex) {
            System.out.println("串流資料擷取錯誤, 錯誤原因: " + ex);
        }
        
    }
}
