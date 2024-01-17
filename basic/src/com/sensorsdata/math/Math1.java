package com.sensorsdata.math;

import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {
        /*
        判断一个数是否为质数（素数），数字从键盘输入

        思路：从键盘输入字符，判断是否是质数，单独写一个函数用来判断质数，大于1的自然数，只能被 1 和自身整除的数
         */

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(is_primer(i))
            System.out.println(i);

    }
    public static  boolean is_primer(int num){
        if(num < 2)
            return false;
        if(num == 2)
            return true;
        boolean flag = true;
        double sqrtNum = Math.sqrt(num); //平方根最大限度减少循环次数
        for(int i = 2; i <= sqrtNum; i++){
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
