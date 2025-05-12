package com.vladproduction.app19.abstraction.simple_examples;

public class Main {
    public static void main(String[] args) {

        MyAbstract myAbstract = new Child2();
        myAbstract.doAction();

        System.out.println("------interfaces--------");

        Inter inter = new Inter();
        InterA interA = new Inter();
        InterB interB = new Inter();

        interA.m1();
        interB.m2();

        m1(inter);
        m2(inter);

    }

    public static void m1(InterA interA){

    }

    public static void m2(InterB interB){

    }

}
