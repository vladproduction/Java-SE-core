package com.vladproduction.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {
    public static void main(String[] args) {

        //version#1
        List<String> list = new ArrayList<>();
        list.add("item");
        List<String> unmodifiableList = Collections.unmodifiableList(list);
//        unmodifiableList.add("item");  //UnsupportedOperationException
        System.out.println(unmodifiableList);

        //version#2
        List<String> unmodifiableList2 = List.of("item1", "item2");
        System.out.println(unmodifiableList2);

    }

}
