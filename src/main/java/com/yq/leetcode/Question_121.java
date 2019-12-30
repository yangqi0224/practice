package com.yq.leetcode;

public class Question_121 {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if(length<2){
            return 0;
        }
        int minV,total;
        int maxV = prices[1] - prices[0] > 0?prices[1] - prices[0]:0;
        if (maxV > 0)
            minV = prices[0];
        else
            minV = prices[1];
        total = minV;
        for(int i = 2;i<length;i++){
            if (prices[i] - minV>maxV){
                maxV = prices[i] - minV;
            }
            if (prices[i] < minV)
                minV = prices[i];
        }
        return maxV;
    }
}
