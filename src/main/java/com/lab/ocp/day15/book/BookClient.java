package com.lab.ocp.day15.book;

public class BookClient {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Thread t1 = new Thread(new Borrow(bookStore), "小明");
        t1.start();
    }
}
