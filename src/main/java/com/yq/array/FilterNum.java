package com.yq.array;

import org.junit.Before;
import org.junit.Test;

import java.util.BitSet;
import java.util.Random;

public class FilterNum {

    private int[] num = new int[100];

    @Before
    public void init(){
        Random r = new Random();
        for (int i = 0;i<100;i++){
            num[i] = r.nextInt(100)+1;
        }
    }

    @Test
    public void findMaxAndMin(){
        int max = num[0];
        int min = num[0];

        for (int i = 1;i<100;i++){
            if (num[i] > max){
                max = num[i];
            }
            if (num[i] < min){
                min = num[i];
            }
        }

        System.out.println("the max num is : "+max+"\nthe min num is : " + min);
    }

    public void findOneMoreTime(){

    }

}
