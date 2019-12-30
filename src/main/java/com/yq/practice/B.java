package com.yq.practice;

import com.sun.istack.internal.NotNull;
import org.junit.Test;

public class B extends A {
    @Test
    public void sout(){
        System.out.println(this.add(1,2,3,4,5,6,7,8,9));
        //System.out.println(this.proTmp);
        int n2 = 9999999;
        System.out.printf("%+,d%n", n2);
    }

    @Test
    public void test(){
        String join = String.join("-","a","b","c","d");
        System.out.println(join);

        String a = "ad";
        String b = "ad";
        System.out.println(a==b);
    }
}
