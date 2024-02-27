package com.vladproduction.functions;

public class Main01 {
    public static void main(String[] args) {
        function();
        function(8);
        function(8, "A");
    }

    public static void function(){
        System.out.println("Hello World");
    }
    public static void function(int num){
        System.out.println("int value = " + num);
    }
    public static void function(int num, String item){
        System.out.println("int value = " + num);
    }
}
