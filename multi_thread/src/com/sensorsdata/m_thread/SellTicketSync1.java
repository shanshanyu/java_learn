package com.sensorsdata.m_thread;

public class SellTicketSync1 implements  Runnable{
    private  int ticket;

    public SellTicketSync1(int ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        sale();
    }
    private synchronized void sale(){
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
