package com.yq.leetcode;

import org.junit.Test;

public class Question_70 {
    public int solution(int n){
        if(n == 1){
            return 1;
        }
        else if (n == 2) {
            return 2;
        }
        return solution(n-1)+solution(n-2);
    }

    @Test
    public void test(){
        System.out.println(solution(5));
    }
}
