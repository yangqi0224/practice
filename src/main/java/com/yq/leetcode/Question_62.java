package com.yq.leetcode;

public class Question_62 {
    public int uniquePaths(int m, int n) {

        int[][] road = new int[n][m];
        for (int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if (j == 0 || i == 0)
                    road[j][i] = 1;
                else {
                    road[j][i] = road[j-1][i] + road[j][i-1];
                }
            }
        }

        return road[n-1][m-1];
    }
}
