package com.vladproduction.cycles;

public class Main01_for {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("--------------");
        for (int i = 100; i > 10; i /= 2){
            System.out.println(i);
        }
        System.out.println("--------------");
        for (float i = 100; i > 10; i /= 2){
            System.out.println(i);
            System.out.println("-----");
        }
    }
}
