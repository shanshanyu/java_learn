package com.sensorsdata.inner_class1;

public class Test {
    public static void main(String[] args) {
        //创建内部类的对象
        Outer.Inner oi = new Outer().new Inner(); //第二种方式

        Object o = new Outer().getInstance(); //第一种方式

        oi.show();


    }
}
