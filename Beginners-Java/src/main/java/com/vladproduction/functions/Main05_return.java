package com.vladproduction.functions;

public class Main05_return {
    public static void main(String[] args) {

        int res = sum(10, 10);
        System.out.println("res = " + res);

        System.out.println(sum(5, 5));

        int sum = sum(5, 5, 5);
        System.out.println("sum = " + sum);

        String bob = name("Bob");
        System.out.println("bob = " + bob);
    }

    public static int sum(int a, int b){
        int res = a + b;
        return res;
    }

    public static int sum(int a, int b, int c){
        int res = a + b + c;
        return res;
    }

    public static String name(String text){
        return text;
    }
}
