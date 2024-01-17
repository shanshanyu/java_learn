package com.sensorsdata.system;

public class SystemTest {
    public static void main(String[] args) {
        /*
            System是一个工具类。

            类方法：
            exit终止虚拟机
            currentTimeMillis    1s = 1000ms  1ms=1000us  1us=1000ns
            arrarycopy  复制数组的，基本类型必须类型匹配，引用类型可以子类复制给父类
         */
        long startTime = System.currentTimeMillis();
        for(int i = 2; i < 100000; i++){
            if(isPrimer1(i))
                System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("这个程序跑了"+(endTime-startTime)+"ms");
    }
    /*
      计算两种计算质数的方法的效率怎么样,通过 System 提供的时间参数相减来判断程序运行的时间
     */
    public static boolean isPrimer(int n){
        if(n <2)
            return false;
        if(n == 2 || n == 3)
            return true;
        boolean flag = true;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isPrimer1(int n){
        //这个程序比上面的要快好几倍
        if(n < 2)
            return false;
        if(n == 2 || n == 3)
            return true;
        boolean flag = true;
        double tmp =  Math.sqrt(n);
        for(int i = 2; i <= tmp; i++){
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
