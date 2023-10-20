package com.sensorsdata.student_manage;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    //private 修饰避免被外部访问，final 表示设置为常量，避免被修改
    private static final String ADD_STUDENT = "1";
    private static final String DEL_STUDENT = "2";
    private static final String MODIFY_STUDENT = "3";
    private static final String QUERY_STUDENT = "4";
    private static final String EXIT = "5";
    public static void main(String[] args) {
        String choice;
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();


        while(true){
            display();
            choice = sc.next();
            switch (choice){
                case ADD_STUDENT: addStudent(students);break;  //用常量表示增加可读性
                case DEL_STUDENT: deleteStudent(students);break;
                case MODIFY_STUDENT: modifyStudent(students);break;
                case QUERY_STUDENT: queryStudent(students);break;
                case EXIT:
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
        System.out.println("请输入学生id: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        if(isExist(students,id)){
            Student st = getStudentById(students,id);
            if(st == null)
                return;
            students.remove(st);
            System.out.println("学生"+st.getName()+"信息删除成功");

        }else{
            System.out.println("该学生id不存在!");
        }

    }

    public static void modifyStudent(ArrayList<Student> students){
        System.out.println("请输入学生id: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        if(isExist(students,id)){
            Student st = getStudentById(students,id);
            if(st == null)
                return ;
            System.out.println("请输入需要修改的学生信息，姓名，年龄，家庭地址：");
            String info = sc.next();
            switch (info){
                case "姓名":
                    System.out.println("请输入学生姓名: ");
                    String name = sc.next();
                    st.setName(name);
                    break;
                case "年龄":
                    System.out.println("请输入学生年龄: ");
                    int age = sc.nextInt();
                    st.setAge(age);
                    break;
                case "家庭地址:":
                    System.out.println("请输入学生家庭地址: ");
                    String area = sc.next();
                    st.setName(area);
                    break;
                default:
                    System.out.println("输入有误，请重新输入!");
            }
            System.out.println("学生"+st.getName()+"信息修改成功");

        }else{
            System.out.println("该学生id不存在!");
        }

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
        //打印某个学生的信息，这几行可以合在一起，写成一行
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

    public static Student getStudentById(ArrayList<Student> students,int id){
        if(isExist(students,id)){
            for(Student st:students){
                if(id == st.getId())
                    return st;
            }

        }else{
            System.out.println("未找到该学生!");

        }
        return null;
    }

}

