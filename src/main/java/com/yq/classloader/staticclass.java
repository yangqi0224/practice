package com.yq.classloader;

public class staticclass {
    public final static int i = 6;
    public static int j;
    static {
        System.out.println("static code is running ...");
    }
}
