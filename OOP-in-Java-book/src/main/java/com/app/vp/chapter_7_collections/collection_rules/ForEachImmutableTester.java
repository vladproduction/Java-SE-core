package com.app.vp.chapter_7_collections.collection_rules;

import java.util.ArrayList;
import java.util.List;

/**
 * An example of using the improved for loop
 * for “non-mutating” (unchanging) objects, such
 * as String
 * */
public class ForEachImmutableTester {
    public static void main(String[] args) {

        /*
        * for loop can not modify “non-mutable” (unchangeable) elements (such as String and base class wrappers)
        * because new references are created;
        * */
        List<String> list = new ArrayList<>();
        list.add("string_");
        list.add("string_");
        list.add("string_");
        System.out.println(list);
        System.out.println("-------------");

        for (String s : list) {
            s += "updated";
        }
        System.out.println(list);

    }
}
