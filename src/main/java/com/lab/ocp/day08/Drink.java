package com.lab.ocp.day08;

// 飲料規格
public interface Drink {
    // 品名 getter/setter
    String getName();
    void setName(String name);
    // 價格 getter/setter
    Integer getPrice();
    void setPrice(Integer price);
}
