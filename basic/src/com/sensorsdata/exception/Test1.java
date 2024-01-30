package com.sensorsdata.exception;

public class Test1 {
    public static void main(String[] args){
        try {
            show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void show()throws  Exception{
        System.out.println("show running");
    }
}
