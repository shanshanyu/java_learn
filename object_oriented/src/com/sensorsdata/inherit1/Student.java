package com.sensorsdata.inherit1;


public class Student {
    public void play(){
        System.out.println("踢足球");
    }

    public void play(String name){
        System.out.println(name+"在玩");
    }
    public void eat(){
        System.out.println("学生吃饭");
    }

}

class OverseaStudent extends  Student{
    //子类重写父类的 eat 方法，加了override 注解
    @Override
    public void eat(){
        System.out.println("老外吃面");
    }
}
