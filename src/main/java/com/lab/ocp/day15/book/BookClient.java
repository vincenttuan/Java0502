package com.lab.ocp.day15.book;

public class BookClient {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        BookStore bookStore2 = new BookStore();
        Thread t1 = new Thread(new Borrow(bookStore), "小明");
        Thread t2 = new Thread(new Borrow(bookStore2), "小華");
        t1.start();
        t2.start();
    }
}
