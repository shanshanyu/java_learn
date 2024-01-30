package com.sensorsdata.m_thread;

public class OpThread implements  Runnable{
    private String name;

    public OpThread(String name) {
        this.name = name;
    }



    @Override
    public void run() {

        for(int i = 0; i < 3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
