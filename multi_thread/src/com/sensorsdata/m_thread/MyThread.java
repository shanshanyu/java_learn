package com.sensorsdata.m_thread;
//创建3个thread，分别休眠10s，20s，30s
public class MyThread  extends  Thread{
    private int time;

    public MyThread(int time) {
        this.time = time;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"running");
        try {
            System.out.println("start sleep"+time/1000+"s");
            Thread.sleep(this.time);

        } catch (InterruptedException e) {
//            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"sleep 结束");

    }
}
