package com.yq.leetcode;

import org.junit.Test;

import javax.swing.plaf.IconUIResource;

/**
 * @ClassName Question_474
 * @Date 2021/3/22 22:45
 * @Author Yang_q
 * @Description TODO
 */

public class Question_474 {

    public int findMaxForm(String[] strs, int m, int n) {

        int length = strs.length;

        //当前0的个数
        int curM = 0;
        //当前1的个数
        int curN = 0;
        //当前集合个数
        int cur = 0;
        int[][] num1And0 = new int[length][2];
        int[] dp = new int[length];
        getNum(strs,num1And0);
        for (int i = 0; i < length; i++) {
            if (dp[i] == 1)
                continue;
            curM += num1And0[i][0];
            curN += num1And0[i][1];
            if (curM <= m && curN <= n){
                cur++;
                dp[i] = 1;
            }
            if (curM > m || curN > n){
                int cmpM = Integer.MAX_VALUE;
                int cmpN = Integer.MAX_VALUE;
                int cmpj = Integer.MAX_VALUE;
                for (int j = i - 1;j >=0; j--){
                    if (dp[j] == 1){
                        if ((num1And0[i][0]-num1And0[j][0])<= curM-m &&
                                (num1And0[i][1]-num1And0[j][1]) <= curN-n){
                            if (cmpM >= num1And0[i][0] && cmpN >= num1And0[j][1]){
                                cmpM = num1And0[i][0];
                                cmpN = num1And0[i][1];
                                cmpj = j;
                            }
                        }
                    }
                }
                if (cmpj != Integer.MAX_VALUE){
                    System.out.println("curM: "+m+" curN: "+n);
                    System.out.println(cmpj);
                    curM = curM - num1And0[i][0] + num1And0[cmpj][0];
                    curN = curN - num1And0[i][1] + num1And0[cmpj][1];
                    dp[i] = 1;
                    System.out.println("curM: "+m+" curN: "+n);
                    dp[cmpj] = 0;
                }
            }
        }

        for (int i = 0; i <dp.length ; i++) {
            System.out.println(dp[i]);
        }
        return cur;
    }

    public void getNum(String[] strs,int[][] dp){
        for (int i = 0;i<strs.length;i++){
            String str = strs[i];
            char[] chars = str.toCharArray();
            int n = 0;
            int m = 0;
            for (char c:chars){
                if (c == '0'){
                    n++;
                }else{
                    m++;
                }
            }
            dp[i][0] = n;
            dp[i][1] = m;
        }
    }

    @Test
    public void test(){
        /**
         * ["10","0","1"]
         * 1
         * 1
         */
        String[] strs = new String[]{"10","0","1"};

        System.out.println(findMaxForm(strs, 1, 1));
    }
}
