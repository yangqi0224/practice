package com.yq.leetcode;

import org.junit.Test;

public class Question_152 {

    /**
     * 给你一个整数数组 nums ，
     * 请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），
     * 并返回该子数组所对应的乘积。
     */
    public int solution(int[] nums){

        int[] min = new int[nums.length];
        int[] max = new int[nums.length];
        int total = Integer.MIN_VALUE;
        for (int i = 0;i<nums.length;i++){
            if (i == 0){
                total = min[i] = max[i] = nums[i];
            }
            else {
                if (nums[i]>0){
                    max[i] = max[i-1]>0?max[i-1]*nums[i]:nums[i];
                    min[i] = min[i-1]<0?min[i-1]*nums[i]:nums[i];
                }else{
                    min[i] = max[i-1]>0?max[i-1]*nums[i]:nums[i];
                    max[i] = min[i-1]<0?min[i-1]*nums[i]:nums[i];
                }

            }
            if (total<max[i])
                total = max[i];

        }
        return total;
    }

    @Test
    public void test(){
        System.out.println(solution(new int[]{2,-5,-2,-4,3}));
    }
}
