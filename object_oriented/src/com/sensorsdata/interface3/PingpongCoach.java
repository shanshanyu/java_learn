package com.sensorsdata.interface3;

public class PingpongCoach extends  Coach implements SpeakEnglish{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教打乒乓球");

    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
