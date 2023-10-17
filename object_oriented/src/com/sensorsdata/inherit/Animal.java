package com.sensorsdata.inherit;

//可以每个类一个文件

public class Animal {  //动物都会吃饭、喝水
    //父类
    public void eat(){
        System.out.println("吃饭");
    }
    public void drink(){
        System.out.println("喝水");
    }
}

class Cat extends  Animal{ //猫
    public void catchMice(){
        System.out.println("抓老鼠");
    }

}

class Dog extends  Animal{ //狗
    public void houseKeeping(){
        System.out.println("看家");

    }
}

class PlushCat extends  Cat{ //布偶猫
    //java这里使用extends，python是用 class PlushCat(Animal){}

}

class CivetCat extends  Cat{ //中国狸花猫

}

class Husky extends  Dog{ //哈士奇
    public void demolishHome(){
        System.out.println("拆家");
    }

}

class Teddy extends  Dog{ //泰迪
    public void giveTry(){
        System.out.println("蹭一蹭");
    }
}
