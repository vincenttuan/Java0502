package com.lab.ocp.day15.book;

public class Borrow implements Runnable {
    private BookStore bookStore;

    public Borrow(BookStore bookStore) {
        this.bookStore = bookStore;
    }
    
    @Override
    public void run() {
        for(int i=0;i<Integer.MAX_VALUE;i++);
        while (BookStore.amount > 0) {            
            bookStore.borrow();
        }
    }
    
}
