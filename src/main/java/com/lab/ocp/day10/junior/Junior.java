package com.lab.ocp.day10.junior;

public class Junior {
    private String school; // 校名
    private Integer amount;// 招生人數
    private Double score;  // 最低分數

    public Junior() {
    }

    public Junior(String school, Integer amount, Double score) {
        this.school = school;
        this.amount = amount;
        this.score = score;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Junior{" + "school=" + school + ", amount=" + amount + ", score=" + score + '}';
    }
    
}
