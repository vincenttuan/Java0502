package com.lab.ocp.day13;

public class AssertDemo {
    public static void main(String[] args) {
        int score = -30; // 0~100
        assert score >= 0 && score <= 100 : "分數錯誤";
        System.out.printf("%d 是合理的分數\n", score);
        
    }
}
