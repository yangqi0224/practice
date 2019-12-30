package com.yq.practice;

public class A {
    private int priTmp = 1;
    protected int proTmp = 2;
    final public int finTmp = 3;
    public int pubTmp = 4;

    public int add(int... elements){
        int sum = 0;
        System.out.println(elements.getClass().getName());
        for (int i:elements){
            sum += i;
        }

        return sum;
    }
}
