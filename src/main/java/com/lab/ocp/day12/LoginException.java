package com.lab.ocp.day12;

public class LoginException extends Exception {

    public LoginException(String string) {
        super(string);
    }
    
    public void how2Do() {
        System.out.println("請重新登入或與我們聯絡...");
    }
}
