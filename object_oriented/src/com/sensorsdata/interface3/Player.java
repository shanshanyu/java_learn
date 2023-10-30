package com.sensorsdata.interface3;

import com.sensorsdata.interface2.Person;

public abstract class Player extends Person {
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    public abstract void learn();
}
