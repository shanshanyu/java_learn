package com.sensorsdata.search_algo;
/*
    常见的查找算法：
    基本查找
    二分查找
    分块查找

    插值查找
    斐波那契查找
    树表查找
    哈希查找
 */

import java.util.Scanner;

public class BasicSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //基本查找其实就是遍历元素，判断元素是否与要查找的元素相等，找到了返回索引，没找到返回-1
        int [] arr = {131,127,147,81,103,23,7,79};

        System.out.println(basicSearch(arr,num));

        /*boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                flag = true;  //如果这里不能直接返回的话就做个标志位

            }
        }
        if(flag){
            System.out.println(num+"存在数组中");
        }else{
            System.out.println(num+"不存在数组中");
        }*/


    }
    public static boolean basicSearch(int[] arr,int num){
        //arr是数据集合，num是要查找的数
        for (int j : arr) {
            if (j == num) {
                return true;//如果这里不能直接返回的话就做个标志位
            }
        }
        return false;
    }

}
