package com.sensorsdata.inner_class;

public class Car {
    private String carName;
    private int carAge;
    private int carColor;

    class Engine{ //内部类，内部类表示的事物是外部类的一部分，内部类单独出现没有意义
        String engineName;
        int engineAge;
    }
}
