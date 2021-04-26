package com.yq.niuke.huawei;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HJ3 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            set.add(sc.nextInt());
        }

        Object[] objects = set.toArray();
        Arrays.sort(objects);

        for (Object o:objects){
            System.out.println(o);
        }
    }


}
