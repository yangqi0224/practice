package com.yq.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest implements Executor {

    //线程数 默认为1
    private int num = 1;
    //线程头 默认为空
    private String threadHead = "";
    //线程名
    private String threadName;

    public ThreadTest(int num,String threadHead){
        this.num = num;
        this.threadHead = threadHead;
    }

    public ThreadTest(int num){
        this.num = num;
    }
    public ThreadTest(){
    }

    /**
     * 获取线程池
     * @return
     */
    public ExecutorService getExecutors(){
        return Executors.newFixedThreadPool(num);
    }

    public void init(){
        ExecutorService executorService = getExecutors();
    }

    @Override
    public void execute(Runnable command) {
        command.run();
    }
}
