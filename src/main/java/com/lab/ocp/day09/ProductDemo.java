package com.lab.ocp.day09;

import java.util.Set;
import java.util.TreeSet;

public class ProductDemo {
    public static void main(String[] args) {
        // 將 products.json 資料匯入
        TreeSet<Product> products = new TreeSet<>();
        products.add(new Product("Pen", 10, 6.5));
        products.add(new Product("Book", 3, 12.5));
        
        // 顯示 products 的內容
        System.out.println(products);
    }
}
