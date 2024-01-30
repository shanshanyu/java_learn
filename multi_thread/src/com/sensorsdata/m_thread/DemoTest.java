package com.sensorsdata.m_thread;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class DemoTest {
    public static void main(String[] args) {
        /*FirstThread t = new FirstThread("A");
        FirstThread t1 = new FirstThread("B");
        t.start();
        t.start();
        t1.start();*/

        /*RunnableThread r = new RunnableThread("A");
        RunnableThread r1 = new RunnableThread("B");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();*/

        /*OpThread tName = new OpThread("A");
        new Thread(tName).start();

        new Thread(tName,"线程1").start();*/

        /*//创建线程对象
        ThreadWait tw = new ThreadWait();
        Thread myThread = new Thread(tw);

        //启动线程
        myThread.start();
        for(int i = 0; i < 50; i++){
            if(i >10){
                try {
                    myThread.join();
                }catch (Exception e){
                    System.out.println(e);
                }

            }
            System.out.println(Thread.currentThread().getName()+"i="+i);
        }*/

        DaemonThread d = new DaemonThread();
        Thread t = new Thread(d);
        t.setDaemon(true);
        t.start();
    }
}
