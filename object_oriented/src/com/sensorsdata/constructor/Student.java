package com.sensorsdata.constructor;

public class Student extends  Person{
    private int id; //学生编号

    public Student() {
        //子类的无参构造
        System.out.println("子类的无参构造");
    }

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
        System.out.println("子类的有参构造");
    }


}
