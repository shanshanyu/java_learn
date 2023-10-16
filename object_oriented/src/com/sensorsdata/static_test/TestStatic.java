package com.sensorsdata.static_test;

public class TestStatic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("zhangsan");
        s1.setAge(15);
        Student.teacherName = "法外狂徒";
        s1.display();

        Student s2 = new Student();
        s2.display();
    }
}
