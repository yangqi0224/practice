package com.yq.leetcode;

public class Question_1153 {

    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "ddkll";

        System.out.println(model(s1).equals(model(s2)));
    }

    public static String model(String str1){
        StringBuffer str1B = new StringBuffer();
        for (int i = 0;i<str1.length();i++){
            if (i == 0){
                str1B.append(1);
            }else {
                if (str1.charAt(i) == str1.charAt(i - 1))
                    str1B.append(str1B.charAt(i - 1));
                else
                    str1B.append(Integer.valueOf(str1B.charAt(i-1))+1);
            }
        }
        return str1B.toString();

    }
}
