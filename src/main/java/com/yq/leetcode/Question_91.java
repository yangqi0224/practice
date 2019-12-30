package com.yq.leetcode;

import org.junit.Test;

public class Question_91 {
    public int numDecodings(String s) {
        int num = s.length();
        int[] max = new int[num];
        if (Integer.valueOf(s.substring(0,1 ))==0)
            return 0;
        for (int i = 0;i<num;i++){
            if (i == 0)
                max[i] = 1;
            else if (i == 1){
                if (Integer.valueOf(s.substring(1,2 )) == 0){
                    if(Integer.valueOf(s.substring(0,1 ))<3)
                        max[i] = 1;
                    else
                        return 0;
                }
                else{
                    if (Integer.valueOf(s.substring(i - 1, i+1))< 27)
                        max[i] = 2;
                    else
                        max[i] = 1;
                }
            }
            else {
                if (Integer.valueOf(s.substring(i-1,i ))==0){
                    if (Integer.valueOf(s.substring(i, i+1)) == 0)
                        return 0;
                    else
                        max[i] = max[i-1];
                }
                else {
                    if (Integer.valueOf(s.substring(i, i+1)) == 0) {
                        if (Integer.valueOf(s.substring(i - 1, i)) <= 2)
                            max[i] = max[i - 2];
                        else
                            return 0;
                    }
                    else if (Integer.valueOf(s.substring(i - 1, i+1))< 27)
                            max[i] = max[i - 2] + max[i - 1];
                    else
                        max[i] = max[i-1];
                }
            }
        }
        return max[num-1];
    }

    @Test
    public void test(){
        System.out.println(numDecodings("17"));
    }
}
