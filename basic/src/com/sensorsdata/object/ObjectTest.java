package com.sensorsdata.object;

public class ObjectTest extends  Object{
    /*
    Object 是java中的顶级父类。
    Ojbect只有一个空参构造。

    成员方法：
    toString、equals、clone

    toString返回值：com.sensorsdata.object.Student@3f3afe78   包名类名@地址值

    Q：直接打印一个对象和调用对象的toString方法返回的值是一样的，这是为什么？
    A：
     */
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);

    }
}
class Student{

}
