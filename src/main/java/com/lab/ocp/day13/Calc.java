package com.lab.ocp.day13;

public class Calc {
    public int add(int x, int y) {
        int result = x + y;
        return result;
    }
    public int sub(int x, int y) {
        int result = x - y;
        return result;
    }
    public int mul(int x, int y) {
        int result = x * y;
        return result;
    }
    public int div(int x, int y) {
        int result = x / y;
        return result;
    }
    public int max(int x, int y) {
        return x > y ? x : y;
    }
    public int min(int x, int y) {
        return x < y ? x : y;
    }
}
