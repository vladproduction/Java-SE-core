package com.vladproduction.demo;

public class InitDemo {
    private final int XX = 50 ;
    private final int ZZ;
    private final int YY;
    {
        ZZ = 20;
        System.out.println("Dynamic section");
    }
    public InitDemo() {
        YY = 30;
        System.out.println("Constructor");
    }
    public static void main(String[] arg) {
        System.out.println("Main");
        InitDemo obj = new InitDemo();
    }
}
