package com.yq.niuke.huawei;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description 请描述类的业务用途
 * @Author yangqi
 * @Date 2021/4/26 1:09 下午
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sp = Integer.valueOf(sc.nextLine());
        String[] split = s.split(",");
        int[] tasks = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            tasks[i] = Integer.valueOf(split[i]);
        }
    }

    public static int getResult(int sp,int[] tasks){
        Arrays.sort(tasks);
        int[] num = new int[tasks.length];
        int[] time = new int[tasks.length*sp];

        time[0] = tasks[0];
        //
        for (int i = 1; i < tasks.length; i++) {

        }



        return 0;
    }
}
