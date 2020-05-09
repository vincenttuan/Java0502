package com.lab.ocp.day03;

public class StringDemo {
    public static void main(String[] args) {
        String word = "she sell sea shell on the sea shore";
        System.out.println("length: " + word.length() + "個字元");
        String[] wordArray = word.split(" ");
        System.out.println(wordArray[0]);
        System.out.println("word: " + wordArray.length + "個字");
        // 有幾個 s -> s 是一個 char
        char[] chars = word.toCharArray();
        int sum = 0;
        for(int i=0;i<chars.length;i++) {
            if(chars[i] == 's') {
                sum++;
            }
        }
        System.out.println("有" + sum + "個 s");
        // 有幾個 sea
        int sum2 = 0;
        for(String w : wordArray) {
            if(w.equals("sea")) {
                sum2++;
            }
        }
        System.out.println("有" + sum2 + "個 sea");
        
    }
}
