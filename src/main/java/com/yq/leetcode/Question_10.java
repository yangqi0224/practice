package com.yq.leetcode;

public class Question_10 {
    public boolean isMatch(String s, String p) {
        /*StringBuffer pT = new StringBuffer(p);
        //化简正则表达式
        for (int i = 0;i<p.length();i++){
            if (i!=p.length()-1&&p.charAt(i) == '*'){
                if (p.charAt(i-1) == '.'||p.charAt(i-1) == p.charAt(i+1)){
                    if (p.charAt(i-1) == '.')
                        break;
                    for (int j = i+2;;j++){
                        if (j<p.length()&&p.charAt(j) == p.charAt(i-1))
                            continue;
                        else {
                            i = j;
                            break;
                        }
                    }

                }
            }
        }*/

        for (int i = 0,j = 0;i<p.length();i++,j++){
            if (p.charAt(i) != '.'&&p.charAt(i)!='*'){
                if (p.charAt(i) != s.charAt(j)&&(i+1==p.length()||p.charAt(i+1)!='*'))
                    return false;
                else continue;
            }
            else if (p.charAt(i) == '.'){
                if (i == p.length()-1&&j == s.length())
                    return true;
            }
            else {
                if (i-1<0)
                    return false;
                if (p.charAt(i - 1) == '.')
                    return true;
                else {
                    /**
                     * "mississippi"
                     * "mis*is*ip*."
                     */
                    for (;;j++){
                        if (j == s.length())
                            return true;
                        if (s.charAt(j) != p.charAt(i - 1))
                            break;
                    }
                }
            }

        }

        return false;
    }
}
