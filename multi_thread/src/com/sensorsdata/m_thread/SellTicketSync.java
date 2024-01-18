package com.sensorsdata.m_thread;
//使用同步代码块的方式解决同步问题

public class SellTicketSync implements  Runnable{
    private  int ticket;

    public SellTicketSync(int ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        synchronized (this){
            if(this.ticket > 0){
                try {
                    Thread.sleep(300);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                this.ticket--;
                System.out.println(Thread.currentThread().getName()+"卖票成功");
                System.out.println(Thread.currentThread().getName()+"当前剩余"+this.ticket);
            }
        }


    }
}
