package com.yq.leetcode;

import org.junit.Test;

public class Question_53 {
    public int climbStairs(int[] n,int num){
        int maxV = n[0];
        int rightZ = 0;
        for (int i = 0;i<num;i++){
            if (n[i]>maxV)
                maxV = n[i];
            if (n[i] > 0)
                rightZ++;
        }
        if (rightZ<=1)
            return maxV;
        int sum = 0;
        int maxSum = n[0];
        for (int i = 0;i<num;i++){
            sum += n[i];
            if (sum < 0)
                sum = 0;
            if (sum > maxSum)
                maxSum = sum;
        }

        return maxSum;
    }

    @Test
    public void test(){
        System.out.println(climbStairs(new int[]{-1, 2,3}, 3));
    }
}
