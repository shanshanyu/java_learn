package com.sensorsdata.exception;

public class Test {
    public static void main(String[] args) {
        try{
            int a = 3/0;
        }catch (Exception e){
            System.out.println(e);
//            e.printStackTrace();
        }
    }

}
