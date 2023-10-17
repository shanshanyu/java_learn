package com.sensorsdata.inherit;

import java.util.Scanner;

class StaticClass{

    private static  String name = "tom";
    private static void play(){
        System.out.println("play");
    }
    public static void show(){
        play();
        System.out.println(name);
    }
}

public class TestStatic {
    //测试类变量和类方法加上 private 访问限制还能访问不
    //不能访问了，加上private只能在本类中访问
    public static void main(String[] args) {

        StaticClass.show();
        StaticClass s = new StaticClass();
        System.out.println(s.toString());
        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}
