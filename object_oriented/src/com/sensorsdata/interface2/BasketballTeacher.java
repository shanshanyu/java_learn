package com.sensorsdata.interface2;

public class BasketballTeacher extends  Person implements TeachBasketball{

    @Override
    public void teachBasketball() {
        System.out.println("篮球教练教打篮球");
    }
}
