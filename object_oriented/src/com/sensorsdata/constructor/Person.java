package com.sensorsdata.constructor;

public class Person {
    private String name;
    private int age;
    public Person() {
        System.out.println("父类的无参构造");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类的有参构造");
    }
}
