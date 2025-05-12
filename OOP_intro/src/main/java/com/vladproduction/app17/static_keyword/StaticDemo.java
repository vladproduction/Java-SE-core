package com.vladproduction.app17.static_keyword;

public class StaticDemo {

    static int a = 10;  //static variable
    int b = 20;         //non-static variable

    //static method
    static void method1(){
        System.out.println("Static method is called");
    }

    //non-static method
    void method2(){
        System.out.println("Non-static method is called");
    }

    //common method
    void method3(){
        System.out.println("\nCommon method is called:");
        System.out.println("a = " + a + ", b = " + b);
        method1();
        method2();
    }

    public static void main(String[] args) {
        //available (variable and method are static)
        System.out.println(a);
        method1();

        System.out.println();
        //not available (variable and method are non-static)
        //System.out.println(b);
        //method2();

        //created object to call non-static method and variable
        StaticDemo staticDemo = new StaticDemo();
        System.out.println(staticDemo.b);
        staticDemo.method2();

        //also common method can be called
        staticDemo.method3();
    }

}
