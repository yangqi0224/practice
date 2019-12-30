package com.yq.leetcode;

public class Question_64 {
    public int minPathSum(int[][] grid) {

        int m = grid[0].length;
        int n = grid.length;
        int[][] value = new int [n][m];
        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                if (i + j == 0)
                    value[i][j] = grid[i][j];
                else if (i*j==0)
                    value[i][j] = i-1>=0?value[i-1][j]+grid[i][j]:value[i][j-1]+grid[i][j];
                else
                    value[i][j] = Math.min(value[i-1][j],value[i][j-1] )+grid[i][j];
            }
        }
        return value[n-1][m-1];
    }
}
