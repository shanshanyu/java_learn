package com.sensorsdata.polymorphism1;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setAge(15);


        Dog d = new Dog();
        d.setAge(2);
        d.setColor("黑色的");

        Cat c = new Cat();
        c.setAge(3);
        c.setColor("灰色的");


        Person p = new Person("老王",30);
        p.keepPet(d,"大便");
        p.keepPet(c,"鱼干");

        System.out.println(d.getClass());

        show(c);
        show(a);

    }
    public static void show(Animal a){
        System.out.println(a.sexy); //变量访问会根据指定的对象来的
    }
}
