package com.sensorsdata.inherit3;

public class TestStudent {
    public static void main(String[] args) {
        Manager m = new Manager(1,"zhangsan",1500.3,1600);
        Cooker c = new Cooker(2,"lisi",1300);

        m.work();
        m.eat();

        c.work();
        c.eat();

    }
}
