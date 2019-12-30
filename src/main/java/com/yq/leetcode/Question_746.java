package com.yq.leetcode;

import org.junit.Test;

public class Question_746 {
    public int minCostClimbingStairs(int[] cost) {

        if (cost.length<=2){
            return cost[cost.length];
        }
        int pre = cost[0];
        int cur = cost[1];
        int n = cur;

        for (int i = 2;i<cost.length;i++){
            n = Math.min(pre,cur )+cost[i];
            pre = cur;
            cur = n;
        }

        return Math.min(cur,pre );
    }

    @Test
    public void test(){
        System.out.println(minCostClimbingStairs(new int[]{0,0,0,1}));
    }
}
