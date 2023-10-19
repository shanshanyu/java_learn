package com.sensorsdata.inherit3;

public class Cooker extends Employee{
    public Cooker() {
    }

    public Cooker(int jobNo, String name, double salary) {
        super(jobNo, name, salary);
    }

    @Override
    public void work(){
        System.out.println("厨师炒菜");
    }
}
