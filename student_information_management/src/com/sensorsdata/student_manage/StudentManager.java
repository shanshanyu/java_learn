package com.sensorsdata.student_manage;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        String choice;
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();


        while(true){
            display();
            choice = sc.next();
            switch (choice){
                case "1": addStudent(students);break;
                case "2": deleteStudent(students);break;
                case "3": modifyStudent(students);break;
                case "4": queryStudent(students);break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }
    }

    public static void display(){
        System.out.println("-------欢迎使用学生信息管理系统---------");
        System.out.println("1.添加学生信息");
        System.out.println("2.删除学生信息");
        System.out.println("3.修改学生信息");
        System.out.println("4.查找学生信息");
        System.out.println("5.退出");
        System.out.println("请输入你的选择：");
    }

    public static void addStudent(ArrayList<Student> students){
        System.out.println("请输入学生id: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        if(isExist(students,id)){
            System.out.println("该id的学生信息已存在，请使用其他id");
        }else{
            Student st = new Student();
            System.out.println("请输入学生姓名: ");
            String name = sc.next();
            System.out.println("请输入学生的年龄: ");
            int age = sc.nextInt();
            System.out.println("请输入学生的家庭住址: ");
            String area = sc.next();

            st.setId(id);
            st.setName(name);
            st.setAge(age);
            st.setArea(area);
            students.add(st); //插入到列表中
            System.out.println("学生"+st.getName()+"信息插入成功");
        }
    }
    public static void deleteStudent(ArrayList<Student> students){

    }

    public static void modifyStudent(ArrayList<Student> students){

    }

    public static void queryStudent(ArrayList<Student> students){
        if(students.isEmpty()){
            System.out.println("学生列表为空！");
        }else{
            for(Student st:students){
                printStudentInfo(st);
            }
        }
    }


    public static void printStudentInfo(Student st){
        //打印某个学生的信息
        System.out.print("id:"+st.getId()+'\t');
        System.out.print("姓名:"+st.getName()+'\t');
        System.out.print("年龄:"+st.getAge()+'\t');
        System.out.println("家庭地址:"+st.getArea());
    }

    public static boolean isExist(ArrayList<Student> students,int id){
        //根据id判断学生是否存在
        boolean flag = false;
        for(Student st:students){
            if(st.getId() == id){
                flag = true;
                break;
            }
        }
        return flag;
    }

}

