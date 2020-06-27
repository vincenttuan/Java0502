package com.lab.ocp.day11;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class HashMapDemo2 {

    public static void main(String[] args) {
        List<Map> list = new ArrayList<>();
        IntStream.rangeClosed(1, 100).forEach(i -> {
            Map<String, Object> map = new LinkedHashMap<>();
            
            list.add(map);
        });
        System.out.println(list);
    }
}
