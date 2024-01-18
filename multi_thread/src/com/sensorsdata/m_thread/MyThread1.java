package com.sensorsdata.m_thread;

public class MyThread1 implements Runnable{
    private int time;

    public MyThread1(int time) {
        this.time = time;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始sleep");
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"结束sleep");
    }
}
