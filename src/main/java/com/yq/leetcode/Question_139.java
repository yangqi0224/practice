package com.yq.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict.size() == 0)
            return false;
        if (s.equals(""))
            return true;
        String total = "";
        for (String tem:wordDict)
            total += tem;
        for (int k = 0;k<s.length();k++)
            if (!total.contains(s.substring(k,k+1)))
                return false;
        int[] l = new int[s.length()];
        int num = 0;
        int i = 0, j = 0;
        while (true) {
            if (j+wordDict.get(i).length()<=s.length()&&s.substring(j, j+wordDict.get(i).length()).contains(wordDict.get(i))) {
                j += wordDict.get(i).length();
                if (j == s.length())
                    return true;
                l[num] = i;
                num++;
                i = 0;
            } else {
                i++;
                while (i == wordDict.size()) {
                    if (num == 0)
                        return false;
                    num--;
                    j -= wordDict.get(l[num]).length();
                    i = l[num]+1;
                }
            }
        }

    }

    @Test
    public void test(){
        List<String> list = new ArrayList<String>(Arrays.asList("leet","code"));
        String s = "leetcode";
        System.out.println(wordBreak(s, list));
        //System.out.println(s.substring(13, 16));
    }

}
