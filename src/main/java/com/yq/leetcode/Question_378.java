package com.yq.leetcode;

/**
 * @author yangqi
 * @version 1.0
 * @class com.yq.leetcode.Question_378
 * @date 2020-07-02 10:46
 */
public class Question_378 {
    /**
     * 给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
     * 请注意，它是排序后的第 k 小元素，而不是第 k 个不同的元素。
     */
    public int kthSmallest(int[][] matrix, int k) {

        //遍历坐标值(x,y)
        int x1 = 0;
        int y1 = 1;

        int x2 = 1;
        int y2 = 0;

        if (k == 1){
            return matrix[0][0];
        }
        while (k > 0){

        }

        return 0;
    }
}
