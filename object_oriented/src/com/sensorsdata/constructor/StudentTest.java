package com.sensorsdata.constructor;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("zhangsan",15,1);
    }
    /*
         理论输出结果：
           父类空参构造
           子类空参构造
           父类有参构造
           子类有参构造
     */
}
