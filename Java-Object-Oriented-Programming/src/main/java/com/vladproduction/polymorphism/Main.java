package com.vladproduction.polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(-7);
        System.out.println(list); //[1, 2, 3, 4, 7, 8, -7]

        //create our odd-lis (has all functionality of ArrayList including methods we had overridden)
        OddArrayList oddList = new OddArrayList();
        oddList.add(1);
        oddList.add(2);
        oddList.add(3);
        oddList.add(4);
        oddList.add(7);
        oddList.add(8);
        oddList.add(-7);

        System.out.println(oddList); //[1, 3, 7, -7] only odd numbers added --> 2, 4, 8 were filtering in runtime

    }
}
