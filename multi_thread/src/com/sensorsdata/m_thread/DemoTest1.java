package com.sensorsdata.m_thread;

import java.sql.SQLOutput;

public class DemoTest1 {
    public static void main(String[] args) {
        /*MyThread t = new MyThread(10000);
        t.start();

        MyThread t1 = new MyThread(20000);
        t1.start();

        MyThread t2 = new MyThread(30000);
        t2.start();*/

        MyThread1 m1 = new MyThread1(10000);
        MyThread1 m2 = new MyThread1(20000);
        MyThread1 m3 = new MyThread1(30000);


        new Thread(m1,"线程1").start();
        new Thread(m2,"线程2").start();
        new Thread(m3,"线程3").start();
    }
}
