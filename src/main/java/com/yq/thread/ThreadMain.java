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

        Thread thread = new Thread(new MyThread(syncTest));
        Thread thread2 = new Thread(new MyThread2(syncTest));
        Thread thread3 = new Thread(new MyThread3(syncTest));

        thread.start();
        thread2.start();
        thread3.start();

    }

}

class MyThread implements Runnable {
    private SyncTest syc;

    public MyThread(SyncTest syc) {
        this.syc = syc;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++)
                syc.syn1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyThread2 implements Runnable {
    private SyncTest syc;

    public MyThread2(SyncTest syc) {
        this.syc = syc;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++)
                syc.syn2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyThread3 implements Runnable {
    private SyncTest syc;

    public MyThread3(SyncTest syc) {
        this.syc = syc;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++)
                syc.syn3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}