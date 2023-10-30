package com.sensorsdata.interface3;

public class Test {
    public static void main(String[] args) {
        PingpongPlayer p = new PingpongPlayer("zhagnsan",15);
        System.out.println(p.getName()+","+p.getAge());
        p.learn();
        p.speak();
    }
}
