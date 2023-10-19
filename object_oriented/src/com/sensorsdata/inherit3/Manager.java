package com.sensorsdata.inherit3;

public class Manager extends Employee {
    private double managerBonus;

    public Manager() {
    }

    public Manager(int jobNo, String name, double salary, double managerBonus) {
        super(jobNo, name, salary);
        this.managerBonus = managerBonus;
    }

    public double getManagerBonus() {
        return managerBonus;
    }

    public void setManagerBonus(double managerBonus) {
        this.managerBonus = managerBonus;
    }

    @Override
    public void work(){
        System.out.println("经理管理其他人");
    }
}
