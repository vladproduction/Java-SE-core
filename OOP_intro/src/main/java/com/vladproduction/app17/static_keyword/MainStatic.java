package com.vladproduction.app17.static_keyword;

public class MainStatic {
    public static void main(String[] args) {

        //Use reference class name – belongs to which class
        System.out.println(StaticDemo.a);

        StaticDemo.method1();

        // Create an object to call non static method/variable
        StaticDemo sd = new StaticDemo();
        System.out.println(sd.b);
        sd.method2();
        sd.method3(); //we called method3() method through the object


    }
}
