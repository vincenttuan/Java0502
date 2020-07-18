package com.lab.ocp.day15.barrier.report;

public class Report {
    private String content;
    private double price;
    private String author;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Report{" + "content=" + content + ", price=" + price + ", author=" + author + '}';
    }
    
    
    
}
