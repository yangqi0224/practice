package com.yq.test;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class ListNum {
    List<Integer> numList = new ArrayList<>();
    List<Integer> newList = new ArrayList<>();
    List<Integer> tmpList = new ArrayList<>();

    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        f(35);
        long e = System.currentTimeMillis();
        System.out.println(e - s);
    }
    static int f(int x){
        int s = 0;
        while ( x -- > 0){
            s += f(x);
        }
        return Math.max(s , 1);
    }

    @Before
    public void init(){

        System.out.println("init running .....");
        Random random = new Random();
        while (numList.size()<1000000){
            numList.add(random.nextInt(1000));
        }
        for (int i = 0;i<100;i++){
            tmpList.add(i);
        }
    }

    /**
     * 求补
     */
    @Test
    public void dealList(){
        long begin = System.currentTimeMillis();
        numList.removeAll(tmpList);
        long end = System.currentTimeMillis();

        System.out.println("the remove 1-100 begin to end time is : "+(end-begin)+"ms\nthe num right of 100 is : "+numList.size());
    }

    /**
     * 遍历
     */
    @Test
    public void dealList2(){
        long begin = System.currentTimeMillis();
        for (int i:numList){
            if (i>=100){
                newList.add(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("the copy list begin to end time is : "+(end-begin)+"ms\nthe num right of 100 is : "+newList.size());
        dealList();
    }

}
