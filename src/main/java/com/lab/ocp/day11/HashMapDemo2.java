package com.lab.ocp.day11;

import com.github.javafaker.Faker;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

public class HashMapDemo2 {

    public static void main(String[] args) throws Exception {
        List<Map<String, Object>> list = new ArrayList<>();
        IntStream.rangeClosed(1, 100).forEach(i -> {
            Map<String, Object> map = new LinkedHashMap<>();
            map.put("height", new Random().nextInt(50) + 150);
            map.put("weight", new Random().nextInt(50) + 50);
            map.put("name", new Faker().name().firstName());
            map.put("sex", new Random().nextInt(2) == 0 ? "female" : "men");
            list.add(map);
        });
        System.out.println(list);
        // 計算出 bmi
        list.stream().forEach(map -> {
            double h = Double.parseDouble(map.get("height").toString());
            double w = Double.parseDouble(map.get("weight").toString());
            double bmi = w / Math.pow(h/100, 2);
            map.put("bmi", bmi);
            map.put("result", bmi > 18 && bmi <= 23 ? true : false);
        });
        System.out.println(list);
        // 匯出 excel
        FileWriter fw = new FileWriter("C:/Users/MB-207/Desktop/bmi.csv");
        // 標頭資料
        fw.write("height,weight,name,sex,bmi,result\n");
        for(Map<String, Object> map : list) {    
            fw.write(String.format("%s,%s,%s,%s,%s,%s\n", 
                    map.get("height"),
                    map.get("weight"),
                    map.get("name"),
                    map.get("sex"),
                    map.get("bmi"),
                    map.get("result")));
        }
        // 統計資料-All
        int totalAmount = list.size();
        long normalAmount = list.stream()
                .filter(map -> new Boolean(map.get("result").toString()))
                .count();
        double normalPercent = normalAmount / (double)totalAmount;
        // 統計資料-Female
        long totalFemale = list.stream()
                .filter(map -> map.get("sex").toString().equalsIgnoreCase("female"))
                .count();
        long normalFemaleAmount = list.stream()
                .filter(map -> map.get("sex").toString().equalsIgnoreCase("female"))
                .filter(map -> new Boolean(map.get("result").toString()))
                .count();
        double normalFemalePercent = normalFemaleAmount / (double)totalFemale;
        // 統計資料-Men
        long totalMen = totalAmount - totalFemale;
        long normalMenAmount = list.stream()
                .filter(map -> map.get("sex").toString().equalsIgnoreCase("men"))
                .filter(map -> new Boolean(map.get("result").toString()))
                .count();
        double normalMenPercent = normalMenAmount / (double)totalMen;
        
        fw.write(String.format("全班正常,%.2f%%,", normalPercent * 100));
        fw.write(String.format("女正常,%.2f%%,", normalFemalePercent * 100));
        fw.write(String.format("男正常,%.2f%%\n", normalMenPercent * 100));
        fw.close();
        System.out.println("匯出成功");
        
        
    }
}
