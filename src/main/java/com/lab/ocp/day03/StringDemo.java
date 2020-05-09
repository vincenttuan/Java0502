package com.lab.ocp.day03;

public class StringDemo {
    public static void main(String[] args) {
        String word = "she sell sea shell on the sea shore";
        System.out.println("length: " + word.length() + "個字元");
        String[] wordArray = word.split(" ");
        System.out.println(wordArray[0]);
        System.out.println("word: " + wordArray.length + "個字");
    }
}
