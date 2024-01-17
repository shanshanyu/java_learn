package com.sensorsdata.reflect;

public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过 Class.forName 获取 class 对象
        Class<?> clazz = Class.forName("com.sensorsdata.reflect.Student");
        System.out.println(clazz);  //clazz是一个 class 对象


        //通过 类名.class 来获取对象
        Class<Student> clazz1 = null;
        clazz1 =Student.class;
        System.out.println(clazz1);

        Student s = new Student();
        Class<? extends Student> clazz2 = s.getClass();
        System.out.println(clazz2);
    }
}
