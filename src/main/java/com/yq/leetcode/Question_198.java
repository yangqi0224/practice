package com.yq.leetcode;

public class Question_198 {
    public int rob(int[] nums) {

        if (nums.length<=2){
            if (nums.length == 0)
                return 0;
            if (nums.length == 1)
                return nums[0];
            else
                return Math.max(nums[0],nums[1]);
        }
        int pre = nums[0];
        int cur = Math.max(nums[0],nums[1]);
        int maxV = cur;

        for (int i = 2;i < nums.length;i++){
            maxV = Math.max(cur, pre + nums[i]);
            pre = cur;
            cur = maxV;
        }
        return maxV;
    }
}
