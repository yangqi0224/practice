package com.yq.thread;

import org.junit.Test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,3,5, TimeUnit.SECONDS,new LinkedBlockingDeque<>(4));
        poolExecutor.execute(new ThreadTest());
        poolExecutor.execute(new ThreadTest());
        poolExecutor.execute(new ThreadTest());
        poolExecutor.execute(new ThreadTest());
        poolExecutor.execute(new ThreadTest());
        poolExecutor.execute(new ThreadTest());
        poolExecutor.execute(new ThreadTest());
        //poolExecutor.execute(new ThreadTest());

        poolExecutor.submit(new ThreadTest());

    }

    @Test
    public  int  func(){
        int i = 0;
        int j = 90;


        try {
            System.out.println(i/j);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println(i);
        }
        return 1;
    }

    static class ThreadTest implements Runnable{

        @Override
        public void run() {
            System.out.println("thread name is : "+Thread.currentThread().getName());
        }
    }
}
