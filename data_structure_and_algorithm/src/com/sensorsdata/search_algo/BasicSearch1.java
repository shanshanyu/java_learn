package com.sensorsdata.search_algo;

import java.util.ArrayList;

/*
    基本查找的进阶版：
    需要找到数组中元素的索引，如果有重复元素，所有的索引都需要

 */
public class BasicSearch1 {
    public static void main(String[] args) {
        int[] arr = {1,3,1,5,1,6};
        System.out.println(basicSearch(arr, 1));

    }

    public static ArrayList<Integer> basicSearch(int[] arr,int num){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                res.add(i);
            }
        }
        return res;
    }
}
