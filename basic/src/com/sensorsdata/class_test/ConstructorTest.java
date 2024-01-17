package com.sensorsdata.class_test;
/*
  java中默认会带一个空参的构造


 */

public class ConstructorTest{
    public static void main(String[] args) {
        MidStudent m = new MidStudent();
    }

}

class Person{
    public Person(){
        System.out.println("person 构造方法执行了");
    }
}

class Student extends Person{
    private String name;
    public Student(){
//        super();  //这行写不写都会执行
        System.out.println("student 构造方法执行了");
    }
    public Student(String name){
        super(); //这行写不写都会执行
        this.name = name;
    }

}

class MidStudent extends Student{

}