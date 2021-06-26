package com.yq.leetcode;

import org.junit.Test;

import java.util.*;

/**
 * @author yangqi
 */
public class Mianshi {
    public boolean isHappy(int n) {

        Map<Integer, Integer> map = new HashMap<>();
        while (true) {
            int sum = 0;
            for (int i = n; i > 0; ) {
                sum += (i % 10) * (i % 10);
                i = i / 10;
            }
            n = sum;
            if (n == 1) {
                return true;
            }
            if (map.containsKey(n)) {
                return false;
            } else {
                map.put(n, 1);
            }


        }

    }

    @Test
    public void test() {
        System.out.println(isHappy(19));
    }
}
