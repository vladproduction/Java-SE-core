package com.vladproduction.demo;

public class InitDemoStaticBlock {
    private int a = 5;
    private static int b = 100;
    {
        a = -5;
        System.out.println("Dynamic initialization section");
    }
    public InitDemoStaticBlock() {
        a = 10;
        b = 10;
        System.out.println("Constructor");
    }
    static {
        b = -5;
        System.out.println("Static initialization section");
    }
    public static void main(String[] arg) {
        System.out.println("Main");
        InitDemoStaticBlock obj = new InitDemoStaticBlock();
        System.out.println("a=" + obj.a + " b=" + b);
    }
    /*Static initialization section
    Main
    Dynamic initialization section
    Constructor
    a=10 b=10*/
}
