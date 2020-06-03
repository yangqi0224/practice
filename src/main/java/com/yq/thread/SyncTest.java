package com.yq.thread;

/**
 * @author yangqi
 * @version 1.0
 * @class com.yq.thread.SyncTest
 * @date 2020-06-03 10:07
 */
public class SyncTest {
    private static final Object obj = new Object();

    public void syn1() throws InterruptedException{
        synchronized (obj){
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName()+".syn1()");
        }
    }
    public void syn2() throws InterruptedException{

        synchronized (obj){
            //Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName()+".syn2()");
        }
    }

    public void syn3() throws InterruptedException{

        synchronized (this){
            //Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName()+".syn3()");
        }
    }
}
