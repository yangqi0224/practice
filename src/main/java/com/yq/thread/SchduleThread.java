package com.yq.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName SchduleThread
 * @Description 请描述类的业务用途
 * @Author yangqi
 * @Date 2021/5/31 12:08 上午
 * @Version 1.0
 **/
public class SchduleThread implements Runnable{
    public SchduleThread() {
        Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(this,3,3, TimeUnit.SECONDS);
    }

    @Override
    public void run() {

        System.out.println("Schedule Thread is running : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        SchduleThread schduleThread = new SchduleThread();
    }
}
