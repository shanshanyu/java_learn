package com.sensorsdata.test;

import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
        //将一维数组转换成二维数组
        int[] s = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        Random r = new Random();
        int index;
        int tmp;
        for(int i=0; i < s.length; i++){
            index = r.nextInt(s.length);
            tmp = s[index];
            s[index] = s[i];
            s[i] = tmp;
        }

        int[][] s1 =  new int[4][4];
        for(int i = 0; i < s.length; i++){
            s1[i/4][i%4] = s[i];
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++)
                System.out.println(s1[i][j]);
        }

    }
}
