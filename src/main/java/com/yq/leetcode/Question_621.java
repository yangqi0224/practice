package com.yq.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Question_621
 * @Description 请描述类的业务用途
 * @Author yangqi
 * @Date 2021/4/26 3:54 下午
 * @Version 1.0
 **/
public class Question_621 {
    public int leastInterval(char[] tasks, int n) {

        Map<Character,Integer> map = new HashMap<>();
        char[] time = new char[tasks.length*(n+1)];

        for (int i = 0;i<tasks.length;i++){
            if (!map.containsKey(tasks[i])){
                map.put(tasks[i],1);
            }else {
                int num = map.get(tasks[i])+1;
                map.put(tasks[i],num);
            }
        }
        for (int i = 0;i<map.size();i++){
            char key = getMaxKey(map);
            insert(key,time,n+1,map.get(key));
            map.put(key,0);
        }

        for (int i = time.length-1;;i--){
            if (time[i] != 0)
                return i+1;
        }
    }

    public char getMaxKey(Map<Character,Integer> map){
        char key = ' ';
        int cur = 0;
        for (char c:map.keySet()){
            if (cur == 0){
                cur = map.get(c);
                key = c;
                continue;
            }else {
                if (cur < map.get(c)){
                    key = c;
                    cur = map.get(c);
                }
            }

        }
        return key;
    }

    public void insert(char c,char[] time,int n,int num){
        for (int i = 0; i < time.length; i++) {
            if (time[i] == 0){
                //if (i<n){
                    for (int j = 0; j < num; j++) {
                        System.out.println(i);
                        while (time[i+j*n] != 0)
                            i++;
                        time[i+j*n] = c;
                    }
                    break;
                //}
            }
        }
    }

    @Test
    public void test(){
        char[] c = new char[]{'A','A','A','B','B','B','C','C','C','D','D','E'};
        leastInterval(c,2);
    }
}
