package com.lab.ocp.day07;

import java.util.Arrays;

public class VarargDemo {
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        int[] nums = {10, 20, 30, 40};
        System.out.println(add(nums));
        System.out.println(add(10, 20, 30, 40, 50));
        System.out.println(add(10, 20, 30, 40, 50, 60, 70, 80));
        System.out.println(add(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        System.out.println(add());
    }
    public static int add(int... nums) {
        return Arrays.stream(nums).sum();
    }
}
