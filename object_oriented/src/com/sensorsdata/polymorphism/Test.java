package com.sensorsdata.polymorphism;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("zhagnsan");
        s.setAge(15);

        Teacher t = new Teacher();
        t.setName("lisi");
        t.setAge(16);

        register(s);

        register(t);

    }

    public static void register(Person p){
        p.show();
    }
}
