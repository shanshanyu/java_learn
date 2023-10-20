package com.sensorsdata.polymorphism1;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setAge(2);
        d.setColor("黑色的");

        Cat c = new Cat();
        c.setAge(3);
        c.setColor("灰色的");


        Person p = new Person("老王",30);
        p.keepPet(d,"大便");
        p.keepPet(c,"鱼干");
    }
}
