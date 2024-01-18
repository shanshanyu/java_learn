package com.sensorsdata.m_thread;

public class FirstThread  extends  Thread{
    private  String name;

    public FirstThread() {
    }

    public FirstThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0;i < 10; i++){
            System.out.println(name+"线程"+" i="+i);
        }
    }
}
