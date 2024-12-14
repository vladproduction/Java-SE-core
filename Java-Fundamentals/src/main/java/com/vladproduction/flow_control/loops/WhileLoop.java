package com.vladproduction.flow_control.loops;

public class WhileLoop {
    public static void main(String[] args) {

        int value = 50;
        decrWhile(value);

        System.out.println("------");
        incrWhile(value);

        System.out.println("------");
        int range = 50;
        int val = 43;
        incrementValueWhile(range, val);

        System.out.println("------");

    }

    private static void incrementValueWhile(int range, int value) {
        System.out.println("incrementValueWhile");
        while (value <= range){
            System.out.print(value++ + " ");
        }
        System.out.println();
    }

    private static void incrWhile(int value) {
        System.out.println("incrWhile");
        while (55 >= value){
            System.out.print(value++ + " ");
        }
        System.out.println();
    }

    private static void decrWhile(int value) {
        System.out.println("decrWhile");
        while (value >= 43){
            System.out.print(value-- + " ");
        }
        System.out.println();
    }

}
