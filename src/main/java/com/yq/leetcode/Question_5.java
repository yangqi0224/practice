package com.yq.leetcode;

public class Question_5 {
    public String longestPalindrome(String s) {

        if (s.length()==0)
            return "";

        for (int i = s.length();i>=2;i--){
            for (int j = 0;j<=s.length()-i;j++){
                if(isPalindrome(s.substring(j,i+j ))){
                    return s.substring(j,i+j );
                }
            }
        }

        return s.substring(0,1 );
    }

    public boolean isPalindrome(String s){
        for (int i = 0;i<s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }

    public String longestPalindromeDP(String s){
        int[] num = new int[]{0,1};
        int[] pd = new int[]{-1,-1};

        for (int i = 0;i<s.length();i++){

            for (int j = 1;;j++){
                if (i-j<0||(i+j)==s.length())
                    break;
                if (s.charAt(i+j) == s.charAt(i-j))
                    continue;
                if (s.charAt(i+j)==s.charAt(i)||s.charAt(i-j)==s.charAt(i)){

                }
            }
        }
        return null;
    }
}
