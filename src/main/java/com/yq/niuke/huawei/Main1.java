package com.yq.niuke.huawei;

import java.util.Scanner;

/**
 * @ClassName Main
 * @Description 请描述类的业务用途
 * @Author yangqi
 * @Date 2021/4/26 11:05 上午
 * @Version 1.0
 **/
public class Main1 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();//取出的糖果数
        System.out.println(getResult2(num));*/
        Scanner scanner = new Scanner(System.in);
        int n = 2;
        int[] num = new int[5];
        for (int i = 0;i<5;i++){
            int tmp = 0;
            try {
                tmp = Integer.valueOf(scanner.next());
            }catch (Exception e){
                System.out.print("[]");
                System.exit(0);
            }
            num[i] = tmp;
        }
        for (int i = 1; i < 5; i++) {
            if (i == 0){
                swap(i,n++,num);
                i++;
            }
            if (i%2 == 0){
                if (num[i] >= num[i-1])
                    continue;
                else {
                    if (i == 4){
                        swap(i,i-1,num);
                        i = i-1;
                        continue;
                    }
                    for (int j = i+1; j < 5; j++) {
                        if (num[j] >= num[i-1]){
                            swap(i,j,num);
                            break;
                        }
                        if (num[i] < num[i-1]){
                            swap(i,i-1,num);
                            i = i-1;
                            break;
                        }
                    }
                }
            }else {
                if (num[i] <= num[i-1])
                    continue;
                else {
                    if (i == 4){
                        swap(i,i-1,num);
                        i = i-1;
                        continue;
                    }
                    for (int j = i+1;j<5;j++){
                        //System.out.println(i);
                        if (num[j] <= num[i-1]){
                            swap(i,j,num);
                            break;
                        }
                        if (num[i] > num[i-1]){
                            swap(i,i-1,num);
                            i = i-1;
                            break;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            if (i == 4)
                System.out.print(num[i]);
            else
                System.out.print(num[i]+" ");
        }
    }

    public static void swap(int a,int b,int[] num){
        int tmp = num[a];
        num[a] = num[b];
        num[b] = tmp;
    }

    public static int getResult2(int num){


        int dp[] = new int[num+2];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;

        for (int i = 2;i<num+2;i++){
            if (i%2!=0){
                dp[i] = dp[i-1]+1;
            }else {
                dp[i] = Math.min(dp[i/2],dp[i-1]) + 1;
            }
        }

        if (num%2 == 0){
            return dp[num];
        }else {
            //需要走额外的一步
            return Math.min(Math.min(dp[num],dp[num-1])+1,dp[num+1]+1);
        }


    }

    public static int getResult(int num){

        if (num == 0 || num == 1){
            return 0;
        }
        //动归数组
        int dp[] = new int[num];
        //初始下标为总数
        dp[0] = num;
        for (int i = 1; i < num; i++) {
            if (dp[i-1] == 1){
                return i-1;
            }
            if (dp[i-1]%2 == 0){
                dp[i] = dp[i-1]/2;
            }else {
                if (((dp[i-1]+1)/2)%2 == 0){
                    dp[i] = dp[i-1] + 1;
                }else {
                    dp[i] = dp[i-1] - 1;
                }
            }
        }
        return 0;
    }
}
