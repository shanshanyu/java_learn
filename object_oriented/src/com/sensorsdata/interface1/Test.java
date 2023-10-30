package com.sensorsdata.interface1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("史努比");
        d.setAge(1);

        d.eat();
        d.swim();
        Scanner sc = new Scanner(System.in);
        sc.next();

    }
}
