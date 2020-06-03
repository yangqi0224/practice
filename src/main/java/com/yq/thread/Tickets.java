package com.yq.thread;

public class Tickets {
    public static void main(String[] args) {
        for (int i = 0;i<300;i++){
            tt t = new tt();
            t.start();
        }
        System.out.println(tt.num);
    }
}

class tt extends Thread{
    public static int num = 300;

    public void run(){
        num--;
        int flag = num;
        /*try {
            Thread.sleep(10);
        }catch (Exception e){
            e.printStackTrace();
        }*/
        if (num < flag){
            System.out.println("静态变量被其他线程修改......");
        }
    }
}