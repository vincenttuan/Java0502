package com.lab.ocp.day09;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.lang.reflect.Type;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProductDemo {
    public static void main(String[] args) throws Exception {
        // 將 products.json 資料匯入
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day09\\products.json");
        String json = new Scanner(file).useDelimiter("\\A").next();
        Type type = new TypeToken<TreeSet<Product>>() {}.getType();
        TreeSet<Product> products = new Gson().fromJson(json, type);
        
        // 顯示 products 的內容
        System.out.println(products);
        
        // 請問總共要花多少錢 ?
        double sum = products.stream().mapToDouble(p -> p.getAmount() * p.getPrice()).sum();
        System.out.printf("%.2f\n", sum);
    }
}
