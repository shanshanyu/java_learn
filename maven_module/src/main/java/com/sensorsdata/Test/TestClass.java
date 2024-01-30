package com.sensorsdata.Test;

public class TestClass {
    //java 中不管是类变量，还是实例变量都写在一块
    //类变量用 static 修饰
    private int age;
    private String name;

    public static String area = "anhui";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //类方法
    public static void display(){
        System.out.println("这是一个类，包括类变量、实例变量、类方法、实例方法");
    }

    public void study(String name){
        System.out.println(name+"在学习");
    }
}
