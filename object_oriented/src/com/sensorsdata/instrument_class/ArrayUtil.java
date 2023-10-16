package com.sensorsdata.instrument_class;


public class ArrayUtil {
    //数组工具类：见名知意   私有构造方法  public方法
    private ArrayUtil(){

    }

    public static String printArr(int[] arr){
        //打印数组的内容，打印的格式为 [a,b,c]
        String result = "";
        int i;
        for(i = 0; i < arr.length; i++){
            if(i == 0){
                result += "[";
                result += arr[i];
                result += ",";
            }else if(i == arr.length-1){
                result += arr[i];
                result += "]";
            }else{
                result += arr[i];
                result += ",";
            }

        }
        return result;
    }

    public static float getAverage(int[] arr){
        int i;
        float res = 0;
        for(i = 0; i < arr.length; i++){
            res += arr[i];
        }
        return res/arr.length;
    }
}
