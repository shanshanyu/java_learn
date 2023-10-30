package com.sensorsdata.interface2;

public class PingpongTeacher extends  Person implements SpeakEnglish,TeachPingpong{

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }

    @Override
    public void teachPingpong() {
        System.out.println("乒乓球教练教打乒乓球");
    }
}
