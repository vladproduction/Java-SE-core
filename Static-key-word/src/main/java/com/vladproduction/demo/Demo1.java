package com.vladproduction.demo;

public class Demo1 {
    public static void main(String[] args) {

        StaticDemo.callMe(); //invoke static method
        System.out.println("b = " + StaticDemo.b); //invoke static variable

        StaticDemo.x = 3;
        StaticDemo.y = 4;
        System.out.println("length = " + StaticDemo.lengthVector());

    }
}

class StaticDemo {
    public static int x;
    public static int y;
    static int a = 42;
    static int b = 99;

    public static int lengthVector() {
        return (int) Math.sqrt (x * x + y * y);
    }

    static void callMe() {
        System.out.println("a = " + a);
    }
}
