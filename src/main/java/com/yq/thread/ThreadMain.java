package com.yq.thread;

/**
 * @author yangqi
 * @version 1.0
 * @class com.yq.thread.ThreadMain
 * @date 2020-06-03 10:14
 */
public class ThreadMain {
    public static void main(String[] args) {
        SyncTest syncTest = new SyncTest();

        Thread thread = new Thread();

    }

}

class MyThread implements Runnable{
    private SyncTest syc;

    public MyThread(SyncTest syc) {
        this.syc = syc;
    }

    @Override
    public void run() {

    }
}