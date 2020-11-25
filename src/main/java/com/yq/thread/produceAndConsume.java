package com.yq.thread;

import java.util.stream.Stream;

/**
 *
 */
public class produceAndConsume {
    //是否存在生产出的消息
    private boolean finished = false;

    //模拟生产出的消息id
    private static int i = 0;

    //对象锁
    private Object o = new Object();

    /**
     * 生产者生产消息
     * @param threadName
     */
    public void produce(String threadName) {
        synchronized (o) {
            while (finished) {  // 这里不用if做判断要用while
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            i++;
            System.out.println(threadName + "生产了消息" + i);
            finished = true;

            //唤醒所有线程（q、生产者）、生产者）
            o.notifyAll();
        }
        return;
    }


    /**
     * 消费者消费消息
     * @param threadName
     */
    public void consume(String threadName) {
        synchronized (o) {
            while (!finished) {  // 这里不用if做判断要用while
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + "消费了消息" + i);
            finished = false;

            //唤醒所有线程（消费者、生产者）
            o.notifyAll();
        }
        return;
    }
}

class Main {
    public static void main(String[] args) {
        produceAndConsume pac = new produceAndConsume();
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //java8 Stream 四个生产者
            Stream.of("p_thread1", "p_thread2", "p_thread3", "p_thread4").forEach(p -> new Thread(p) {
                @Override
                public void run() {
                    pac.produce(p);
                }
            }.start());

            //java8 Stream 2个消费者
            Stream.of("c_thread1", "c_thread2").forEach(c -> new Thread(c) {
                @Override
                public void run() {
                    pac.consume(c);
                }
            }.start());
        }
    }
}
