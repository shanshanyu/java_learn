package com.sensorsdata.interface2;

public class PingpongPlayer extends Person implements SpeakEnglish,LearnPingpong{

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }

    @Override
    public void learnPingpong() {
        System.out.println("乒乓球运动员学打乒乓球");
    }
}
