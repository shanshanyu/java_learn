package com.sensorsdata.m_thread;

//等待其他线程执行完再继续执行
//打印 1~10,然后再让其他线程打印
public class ThreadWait implements Runnable{

    //打印 i 的 值
    @Override
    public void run() {
        for(int i = 0; i < 50; i++){
            System.out.println(Thread.currentThread().getName()+",i = "+i);
        }
    }
}
