package com.sensorsdata.m_thread;

public class DemoTest2 {
    public static void main(String[] args) {
        /*SellTicket s = new SellTicket(3);
        new Thread(s,"线程1").start();
        new Thread(s,"线程2").start();
        new Thread(s,"线程3").start();
        new Thread(s,"线程4").start();
        new Thread(s,"线程5").start();*/


        SellTicketSync1 s = new SellTicketSync1(3);
        new Thread(s,"线程1").start();
        new Thread(s,"线程2").start();
        new Thread(s,"线程3").start();
        new Thread(s,"线程4").start();
        new Thread(s,"线程5").start();

    }
}
