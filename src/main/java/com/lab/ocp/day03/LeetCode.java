package com.lab.ocp.day03;

public class LeetCode {
    public static void main(String[] args) {
        int[] nums = {6, 11, 2, 14, 7};
        int target = 9;
        int[] ans = twoSum(nums, target);
        // 期待印出 [2, 4]
        for(int n : ans) {
            System.out.println(n);
        }
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        outer:
        for(int i=0;i<nums.length;i++) {
            if(nums[i] < target) {
                for(int j=i+1;j<nums.length;j++) {
                    if(nums[j] == target - nums[i]) {
                        ans[0] = i;
                        ans[1] = j;
                        break outer;
                    }
                }
            }
        }
        return ans;
    }
    
}
