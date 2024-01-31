package com.sensorsdata.search_algo;
/*
    二分查找：
    前提条件：数组中的数据必须是有序的


 */

public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binSearch(arr, 9));
    }
    public static int binSearch(int[] arr,int num){
        int min = 0;
        int max = arr.length-1;
        int mid;

        while(min <= max){
            mid = (max+min)/2; //这一句
            if(arr[mid] == num){
                return mid;
            }else if(arr[mid] < num){
                min = mid+1; //这两句是二分查找的精髓
            }else{
                max = mid-1; //这两句是二分查找的精髓
            }
        }
        return -1;
    }
}
