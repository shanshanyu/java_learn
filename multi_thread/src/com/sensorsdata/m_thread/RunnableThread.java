package com.sensorsdata.m_thread;

public class RunnableThread implements Runnable{
    private String name;

    public RunnableThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(name+"线程"+"i="+i);
        }

    }
}
