package com.sensorsdata.interface2;

public class BasketballPlayer extends Person implements LearnBasketball{
    @Override
    public void learnBasketball() {
        System.out.println("篮球运动员学打篮球");
    }
}
