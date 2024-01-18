package com.sensorsdata.m_thread;

public class DaemonThread implements  Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
