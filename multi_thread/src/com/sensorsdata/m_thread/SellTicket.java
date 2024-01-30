package com.sensorsdata.m_thread;

public class SellTicket implements Runnable{
    private int ticket  = 0;

    public SellTicket(int ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        if(this.ticket > 0){
            try{
                Thread.sleep(300);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            this.ticket--;
            System.out.println("卖票成功");
            System.out.println("还剩下"+ this.ticket);

        }
    }
}
