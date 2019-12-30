package com.yq.leetcode;

import java.util.List;

public class Question_120 {
    public int minimumTotal(List<List<Integer>> triangle){

        if (triangle.size() == 0)
            return 0;
        if (triangle.size() == 1)
            return triangle.get(0).get(0);
        else {
            for (int i = triangle.size();i>=1;i--)
                minTwo(triangle,i);

            return triangle.get(0).get(1);
        }
    }

    public void minTwo(List<List<Integer>> triangle , int n){

        for (int i = 0;i<n-1;i++){
            if (n == triangle.size())
                triangle.get(n-2).
                        add(triangle.get(n-2).get(i)
                                + Math.min(triangle.get(n-1).get(i),triangle.get(n-1).get(i+1)));
            else
                triangle.get(n-2).
                        add(triangle.get(n-2).get(i)
                                + Math.min(triangle.get(n-1).get(i+n),triangle.get(n-1).get(i+n+1)));

        }

    }
}
