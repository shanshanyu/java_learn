package com.sensorsdata.codeblock; //代码块
//代码块分为四种：普通代码块   构造代码块   静态代码块   同步代码块（线程中）

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        /*
             静态代码块执行了
             构造代码块执行了
             构造方法执行了
         */

    }
}
