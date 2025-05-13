package com.vladproduction.app23.equals_hashcode;


import java.util.concurrent.atomic.AtomicInteger;

public class ContractEqualsHasCode {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        //1 transitive a~b b~c c~a
        //2 symmetry if a~b b~a
        //3 reflexivity
        Object obj1 = new Object();
        System.out.println("------");
        System.out.println(obj1.equals(obj1));
        System.out.println("------");

        //4 hashCode equivalent

        String s = "a";
        String s2 = new String("a");

        Integer int1 = -129;
//        Integer int2 = new Integer(1);
        Integer int2 = -129;

        System.out.println(int1.hashCode() == int2.hashCode());
        System.out.println(int1 == int2);
        System.out.println(int1.hashCode());
        System.out.println(int2.hashCode());

        System.out.println(int1.equals(int2));
        System.out.println(int2.equals(int1));

        AtomicInteger atomicInteger = new AtomicInteger();

        Object nullObject = new Object();
        nullObject.equals(null);




    }
}
