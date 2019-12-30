package com.yq.leetcode;

public class Question_303 {
    private int[] nums;
    int sum[];
    public Question_303(int[] nums) {
        this.nums = nums;
        sum = new int[nums.length];
        int l = 0;
        for (int i = 0; i<nums.length;i++){
            l += nums[i];
            sum[i] = l;
        }
    }
    public int sumRange(int i, int j) {
        if(i<0||j>nums.length)
            return 0;
        if (i == 0){
            return sum[j];
        }
        return sum[j] - sum[i-1];
    }
}
