package com.sensorsdata.polymorphism;

public class Student extends  Person{


    public Student() {
    }

    public Student(String name,int age) {
        super(name,age);
    }

    @Override
    public void show(){
        System.out.println("学生："+getName()+getAge());
    }
}
