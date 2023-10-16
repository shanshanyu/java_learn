package com.sensorsdata.instrument_class;


public class TestArr {
    //测试类
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        String s = ArrayUtil.printArr(arr);
        System.out.println(s);

        float avg;
        avg = ArrayUtil.getAverage(arr);
        System.out.println("avg:"+avg);

    }
}
