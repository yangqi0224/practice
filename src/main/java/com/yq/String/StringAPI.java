package com.yq.String;

import org.junit.Test;

public class StringAPI {

    @Test
    public void testAPI(){
        String a = "oiusoaifduoasf";
        String b = a.substring(2);
        String c = a.substring(2,2);


        System.out.println(c);
    }

    @Test
    public void indexOf(){
        String str = "this array is very long, but that array is very short";
        String tmp = "array";
        System.out.println(str.indexOf(tmp));
    }
    public static void main(String[] args) {
        PatternTest p = new PatternTest();
    }
}
