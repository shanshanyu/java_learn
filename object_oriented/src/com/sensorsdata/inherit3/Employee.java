package com.sensorsdata.inherit3;

public class Employee {
    //创建一个有继承继承的javabean类,有两个子类，经理类   厨师类
    private int jobNo; //工号
    private String name;//姓名
    private double salary; //工资

    public Employee() {

    }

    public Employee(int jobNo, String name, double salary) {
        this.jobNo = jobNo;
        this.name = name;
        this.salary = salary;
    }

    public int getJobNo() {
        return jobNo;
    }

    public void setJobNo(int jobNo) {
        this.jobNo = jobNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void work(){
        System.out.println("员工工作");
    }

    public void eat(){
        System.out.println("吃米饭");
    }
}
