package com.sensorsdata.string;

public class String1 {
    public static void main(String[] args) {
        //StringTable 串池，jdk1.8中，在堆中
        //直接赋值的时候，字符串的值存储在串池中
        //new String 的时候，字符串在堆中
        // == 运算符对于基本数据类型比较的是值，对于引用数据类型比较的地址
        String name = "张三";   //name  name1  name2 不在栈上，在串池里面
        String name1 = "李四";


        char[] str = {'a','b','c'};
        String name3 = new String(str);  //name3  nam34 在堆上，str 也在堆上
        String name4 = new String(str);
        //name3 和 name4 是同一个对象吗？
        //不是，只要用了 new，就是一个新对象
        System.out.println(name3 == name4);



    }
}
