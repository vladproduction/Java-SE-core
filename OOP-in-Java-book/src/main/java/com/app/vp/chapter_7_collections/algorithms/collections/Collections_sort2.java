package com.app.vp.chapter_7_collections.algorithms.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections_sort2 {
    public static void main(String[] args) {

        String[] strings = {"One","Two","Three","One","Two","Three"};
        List<String> stringList = Arrays.asList(strings);
        System.out.println("stringList original = " + stringList);
        Collections.sort(stringList);
        System.out.println("stringList after sort = " + stringList);


    }
}
