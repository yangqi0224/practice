package com.yq.leetcode;

/**
 * @author yangqi
 * @version 1.0
 * @class com.yq.leetcode.LeetCode123
 * @date 2020-05-20 14:50
 */
public class LeetCode123 {

    public int solution(int[] max){
        int[][] ser = new int[3][max.length/2];
        int cur = 0;
        int num = 0;
        for (int i = 1; i < max.length-1; i++) {
            if (max[i] < max[cur]){
                if (i - cur > 1){
                    ser[0][num] = cur;
                    ser[1][num] = i-1;
                    ser[2][num] = max[i-1] - max[cur];
                    cur = i;
                    num++;
                }else {
                    cur = i;
                }
            }

        }

        return 0;
    }
}
