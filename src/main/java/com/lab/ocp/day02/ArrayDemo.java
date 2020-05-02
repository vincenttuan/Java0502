package com.lab.ocp.day02;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 100;
        nums[1] = 90;
        nums[2] = 80;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums);
        System.out.println(nums.length); // 陣列長度
        // 陣列的最小維度=0, 陣列的最大維度=陣列長度-1
        
    }
}
