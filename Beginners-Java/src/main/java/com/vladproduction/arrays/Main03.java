package com.vladproduction.arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main03 {
    public static void main(String[] args) {

        System.out.println("-----------array list----------");
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(45);
        list.add(145);
        list.add(29);
        list.add(13);
        list.add(100);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(4));
        list.set(2, 30);
        System.out.println(list.get(2));

        System.out.println("-----------linked list----------");
        LinkedList<String> names = new LinkedList<>();
        names.add("name0");
        names.add("name1");
        names.add("name2");
        names.add("name3");
        names.add("name4");
        System.out.println(names.get(0));
        System.out.println(names.get(4));




    }
}
