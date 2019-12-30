package com.yq.leetcode;

public class Question_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid[0].length;
        int n = obstacleGrid.length;
        int[][] road = new int[n][m];
        for (int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if (obstacleGrid[j][i] == 1)
                    road[j][i] = 0;
                else {
                    if(j == 0&&i==0)
                        road[j][i] = 1;
                    else if (j == 0 || i == 0)
                        road[j][i] = i-1>=0?road[j][i-1]:road[j-1][i];
                    else {
                        road[j][i] = road[j-1][i] + road[j][i-1];
                    }
                }
            }
        }

        return road[n-1][m-1];
    }
}
