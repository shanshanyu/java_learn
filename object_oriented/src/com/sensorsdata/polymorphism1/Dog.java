package com.sensorsdata.polymorphism1;

public class Dog extends  Animal {
    @Override
    public void eat(String sth){
        System.out.println(getAge()+"岁的"+getColor()+"狗死死抱着"+sth+"猛啃");
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
}
