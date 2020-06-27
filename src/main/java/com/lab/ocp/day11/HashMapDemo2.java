package com.lab.ocp.day11;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

public class HashMapDemo2 {

    public static void main(String[] args) {
        List<Map> list = new ArrayList<>();
        IntStream.rangeClosed(1, 100).forEach(i -> {
            Map<String, Object> map = new LinkedHashMap<>();
            map.put("height", new Random().nextInt(50) + 150);
            map.put("weight", new Random().nextInt(50) + 50);
            map.put("name", "John");
            list.add(map);
        });
        System.out.println(list);
    }
}
