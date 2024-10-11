package com.vladproduction.assignment3;

public class Main {
    public static void main(String[] args) {
        //default constructor and it has all functionality as standard ArrayList
        ModArrayList listy = new ModArrayList();
        listy.add(0);
        listy.add(10);
        listy.add(20);
        listy.add(30);

        System.out.println(listy.getModIndex(1));
        System.out.println(listy.getModIndex(-2));
        System.out.println(listy.getModIndex(40));

        // 10 20 0 --> output

    }
}
