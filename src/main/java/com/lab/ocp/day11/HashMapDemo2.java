package com.lab.ocp.day11;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

public class HashMapDemo2 {

    public static void main(String[] args) {
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
        });
        System.out.println(list);
    }
}
