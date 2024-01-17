package com.sensorsdata.runtime;

public class RuntimeTest {
    public static void main(String[] args) {
        /*
           当前虚拟机的运行环境
            getRuntime: 对象需要通过 getRuntime 方法来获得。  runtime是创建一个私有的类对象，然后通过类方法返回类对象。
            exit：停止虚拟机
            availableProcessors：获取cpu线程数
            maxMemory：jvm能从系统中获取的总大小
            totalMemory：jvm已经从系统中获取的总大小
            freeMemory：jvm剩余内存大小
            exec：运行cmd命令

            exit方法，System.exit实际调用的就是 Runtime exit方法
             public static void exit(int status) {
                 Runtime.getRuntime().exit(status);
            }
         */

    }
}
