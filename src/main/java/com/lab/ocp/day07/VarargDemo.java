package com.lab.ocp.day07;

import java.util.Arrays;

public class VarargDemo {
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        int[] nums = {10, 20, 30, 40};
        System.out.println(add(nums));
    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static int add(int x, int y, int z) {
        return x + y + z;
    }
    public static int add(int [] nums) {
        return Arrays.stream(nums).sum();
    }
}
