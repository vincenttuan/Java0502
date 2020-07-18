package com.lab.ocp.day16.executor;

public class Main {
    public static void main(String[] args) {
        GetTime getTime = new GetTime();
        MyExecutor exec = new MyExecutor();
        exec.execute(getTime);
        exec.execute(getTime);
        exec.execute(getTime);
    }
}
