package com.sensorsdata.my_collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        /*

        contains方法如果需要判断对象，对象的方法需要重写equals方法

         */
        Collection<String> arr = new ArrayList<String>();
        //添加元素
        arr.add("123");
        arr.add("abc");
        System.out.println(arr.size());
        System.out.println("数组是否位空"+arr.isEmpty());
        //删除元素
        arr.remove("123");
        System.out.println(arr.size());


    }
}
