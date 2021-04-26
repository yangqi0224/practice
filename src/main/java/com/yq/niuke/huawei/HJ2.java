package com.yq.niuke.huawei;

import java.util.Scanner;

public class HJ2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String tmp = sc.nextLine().toLowerCase();

        System.out.print(countNum(str,tmp.charAt(0)));
    }

    public static int countNum(String str,char c){

        char[] chars = str.toCharArray();

        int count = 0;
        for (char c1:chars){
            if (c1 == c){
                count++;
            }
        }

        return count;
    }


}
