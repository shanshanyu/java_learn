package com.sensorsdata.inherit2;

public class Husky  extends  Animal{
    public void destroyHome(){
        System.out.println("拆家");
    }

    //方法重写
    @Override
    public void eat(){
        System.out.println("吃狗粮");
    }
}
