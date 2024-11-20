package com.vladproduction.demo;

public class MainABApp {
    public static void main(String[] args) {

        A a = new B();//1.0 AB
        System.out.println(a.version + a.testMethod());

        B b = new B();//1.0 BB
        System.out.println(b.version + b.testMethod());
    }
}