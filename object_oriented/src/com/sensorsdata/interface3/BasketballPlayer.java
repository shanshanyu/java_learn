package com.sensorsdata.interface3;

public class BasketballPlayer extends Player{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("篮球运动员学习打篮球");
    }
}
