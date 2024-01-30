package com.sensorsdata.polymorphism1;

public class Cat extends Animal{
    private  String name;
    private int age;

    String sexy = "male";
    @Override
    public void eat(String sth){
        System.out.println(getAge()+"岁的"+getColor()+"猫眯着眼睛侧着头吃"+sth);
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
