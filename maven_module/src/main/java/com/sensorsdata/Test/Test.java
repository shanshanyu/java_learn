package com.sensorsdata.Test;

public class Test {
    public static void main(String[] args) {
        TestClass s = new TestClass();
        s.setName("zhagnsan");
        TestClass.display();  //类方法
        System.out.println(TestClass.area); //类变量
        s.study(s.getName());  //实例方法
    }
}
