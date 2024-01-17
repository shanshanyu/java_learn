package com.sensorsdata.string;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        /*
        遍历字符串：
        键盘输入一个字符串，遍历该字符串

        思路：读取字符串，转换成字符数组，遍历字符数组
         */

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char[] chs = input.toCharArray();

        for(int i = 0; i < chs.length; i++){
            System.out.println(chs[i]);
        }

    }
}
