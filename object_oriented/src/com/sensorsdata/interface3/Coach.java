package com.sensorsdata.interface3;

import com.sensorsdata.interface2.Person;

public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public  abstract void teach();
}
