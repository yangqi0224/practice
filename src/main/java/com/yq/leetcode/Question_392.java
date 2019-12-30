package com.yq.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class Question_392 {

    private HashMap<String,String> solu = new HashMap<>();
    public boolean isSubsequence(String s, String t) {

        if (solu.containsKey(s)){
            if (solu.get(s).equals(t)){
                return true;
            }
        }
        char tem[] = s.toCharArray();
        int pre = -1;
        for (int i = 0;i<tem.length;i++){
            int cur = t.indexOf(tem[i],pre+1);
            if (cur <= pre)
                return false;
            pre = cur;
        }
        solu.put(s, t);
        return true;
    }

    @Test
    public void test(){
        String s = "leetcode";
        System.out.println(s.indexOf('e',-1));
    }
}
