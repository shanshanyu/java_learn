package com.sensorsdata.inner_class1;

public class Outer {
    private  int a = 10;
    public Inner getInstance(){
        return new Inner();
    }

    class Inner{
        private int a = 20;
        public Inner(){
            System.out.println("创建inner对象");
        }
        public void show(){
            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Outer.this.a); //内部类对象里面有一只指向外部类对象的指针
        }
    }
}
