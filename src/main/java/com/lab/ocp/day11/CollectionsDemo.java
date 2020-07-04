package com.lab.ocp.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);list.add(1);list.add(2);list.add(4);
        System.out.println(list);
        Collections.sort(list); // 排序 (小 -> 大)
        System.out.println(list);
        Collections.sort(list, (n1, n2) -> n2 - n1); // 排序 (大 -> 小)
        System.out.println(list);
        System.out.println(Collections.min(list)); // 最小值
        System.out.println(Collections.max(list)); // 最大值
        Collections.shuffle(list); // 洗牌
        System.out.println(list);
        
    }
}
