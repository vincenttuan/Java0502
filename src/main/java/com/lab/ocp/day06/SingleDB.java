package com.lab.ocp.day06;

public class SingleDB {
    
    private String data = "一百萬筆資料...";
    private static SingleDB instance = new SingleDB();
    private SingleDB() {
        
    }
    public static SingleDB getInstance() {
        return instance;
    }
    public String getData() {
        return data;
    }
    
}
