package com.lab.ocp.day07;

enum Sex {
    man, female;
    
    private Sex() {
        System.out.println("呼叫 Sex 建構子");
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        checkSex(Sex.man);
    }
    public static void checkSex(Sex sex) {
        switch(sex) {
            case man:
                System.out.println("男生");
                break;
            case female:
                System.out.println("女生");
                break;
        }
        
    }
}
