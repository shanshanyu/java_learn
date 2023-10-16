package com.sensorsdata.static_test;

public class Student {
    //定义一个类属性 teacherName
    private String name;
    private int age;
    public static String teacherName; //类属性

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getTeacherName() {
        return teacherName;
    }

    public static void setTeacherName(String teacherName) {
        Student.teacherName = teacherName;
    }

    public void display(){
        System.out.println("name:"+name+"\t"+"age:"+age+"\t"+"teachername:"+Student.teacherName);
    }
}
