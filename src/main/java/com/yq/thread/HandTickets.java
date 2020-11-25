package com.yq.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangqi
 * @version 1.0
 * @class com.yq.thread.HandTickets
 * @date 2020-06-04 17:23
 */
public class HandTickets {

}
class Ban implements Runnable{
    private static int tick = 500;
    private static List<Object> lockList = new ArrayList();
    static {
        for (int i = 0;i<6;i++){
            lockList.add(new Object());
        }
    }
    private static int lockFlag = 6;
    @Override
    public void run() {
        while (lockFlag == 0){
            lockFlag --;
            //获取lockList中元素的锁
            synchronized (lockList.get(0)){
                //
            }
            lockFlag++;
            break;
        }
    }
}