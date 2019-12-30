package com.yq.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question_96 {

    public int numTrees(int n) {
        if (n<3)
            return n;
        else {
            int[] treeNum = new int[n+1];
            treeNum[0] = treeNum[1] = 1;
            treeNum[2] = 2;
            for (int i = 3;i<=n;i++){
                for (int j = 0;j<i;j++){
                    treeNum[i] += treeNum[j]*treeNum[i-j-1];
                }
            }
            return treeNum[n];
        }
    }

    @Test
    public void test(){
        System.out.println(numTrees(5));
    }

}
