package com.sensorsdata.string;

import java.util.Scanner;

public class TestStr {
    public static void main(String[] args) {
        //byte  short  int long   float  double   char  boolean  基本类型
        //class interface  array  引用类型

        //内存：堆  栈  方法区   本地方法区  寄存器区
        Scanner sc = new Scanner(System.in);
        try {
            float f = sc.nextFloat();
            System.out.println(f);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            sc.close();
        }




    }
}

