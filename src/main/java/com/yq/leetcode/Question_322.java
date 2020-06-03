package com.yq.leetcode;

/**
 * @author yangqi
 * @version 1.0
 * @class com.yq.leetcode.Question_322
 * @date 2020-05-12 14:17
 */
public class Question_322 {
    /**
     * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
     * 如果没有任何一种硬币组合能组成总金额，返回 -1。
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/coin-change
     */
    public static int solution(int[] coins,int amount){

        int flag[] = new int[amount+1];

        if (amount == 0)
            return 0;
        for (int j = 0;j<=amount;j++){
            for (int i = 0;i<coins.length;i++){
                if (coins[i]>amount)
                    continue;
                if (j+coins[i] <= amount)
                    if ((flag[j]!=0||j == 0)&&(flag[j+coins[i]]>flag[j]+1||flag[j+coins[i]]==0))
                       flag[j+coins[i]] = flag[j]+1;
            }
        }
        return flag[amount]==0?-1:flag[amount];
    }

    public static void main(String[] args) {
        /**
         * [2147483647]
         * 2
         */
        int[] coins = new int[]{2147483647};

        System.out.println(solution(coins, 2));
    }

}
