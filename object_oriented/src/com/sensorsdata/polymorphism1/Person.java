package com.sensorsdata.polymorphism1;

public class Person {
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /*
    //方法重载,keepPet方法用重载不是很好，因为动物太多的话得写多个 keepPet方法
    public void keepPet(Dog dog,String sth){
        System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+dog.getColor()+dog.getAge()+"岁的狗");
        dog.eat(sth);
    }

    //方法重载
    public void keepPet(Cat cat,String sth){
        System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+cat.getColor()+cat.getAge()+"岁的猫");
        cat.eat(sth);
    }*
     */
    public void keepPet(Animal a,String sth){
        System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+a.getColor()+a.getAge()+"岁的猫");
        a.eat(sth);
    }
}
