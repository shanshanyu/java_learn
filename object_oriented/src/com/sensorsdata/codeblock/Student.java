package com.sensorsdata.codeblock;

public class Student {
    {
        System.out.println("构造代码块执行了");
    }
    static {
        System.out.println("静态代码块执行了");
    }
    public Student(){
        System.out.println("构造方法执行了");
    }
}
