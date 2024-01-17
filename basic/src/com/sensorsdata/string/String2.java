package com.sensorsdata.string;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        /*
            键盘录入的 abc 和定义的 abc 地址不一样是为什么？

         */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();  //这种方式是通过 new 调用的
        String s1 = "abc";
        System.out.println(s1==str);
    }
}
