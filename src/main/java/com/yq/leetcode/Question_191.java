package com.yq.leetcode;

import org.junit.Test;

/**
 * @ClassName Question_191
 * @Date 2021/3/22 22:07
 * @Author Yang_q
 * @Description TODO
 */

public class Question_191 {

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0){
            count += n&1;
            n >>>= 1;
        }

        return count;
    }

    @Test
    public void test(){
        System.out.println(hammingWeight(-3));
    }
}
