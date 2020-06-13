package com.lab.ocp.day09;

import java.util.Set;
import java.util.TreeSet;

public class ProductDemo {
    public static void main(String[] args) {
        // 將 products.json 資料匯入
        Set<Product> products = new TreeSet<>();
        
        // 顯示 products 的內容
        System.out.println(products);
    }
}
