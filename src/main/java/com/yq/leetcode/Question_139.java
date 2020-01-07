package com.yq.leetcode;

import java.util.List;

public class Question_139 {
    //dp
    public boolean wordBreak(String s, List<String> wordDict) {

        int[] dp = new int[s.length()];
        dp[0] = 0;
        for (int i = 0;i<s.length();i++){
            for (int j = i+1;j<s.length()+1;j++){
                if (i>0&&dp[i-1] == 0)
                    break;
                for (int k = 0;k<wordDict.size();k++){
                    if (s.substring(i,j ).equals(wordDict.get(k)))
                        dp[j-1] = 1;
                }
            }
        }
        if (dp[s.length()-1] == 1)
            return true;
        else
            return false;

    }

    //回溯
    public boolean wordBreakDP(String s, List<String> wordDict){

        for (int i = 0;i<wordDict.size();i++){
            if (s.length()<wordDict.get(i).length()){
                if (i < wordDict.size()-1)
                    continue;
                else
                    return false;
            }
            if (s.substring(0,wordDict.get(i).length() ).equals(wordDict.get(i))){
                if (s.length() == wordDict.get(i).length())
                    return true;
                else if (wordBreakDP(s.substring(wordDict.get(i).length(),s.length()),wordDict))
                    return true;
            }
        }

        return false;
    }

}
