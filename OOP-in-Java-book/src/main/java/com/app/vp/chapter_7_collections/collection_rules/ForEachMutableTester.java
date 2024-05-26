package com.app.vp.chapter_7_collections.collection_rules;

import java.util.ArrayList;
import java.util.List;

/**
 * test how we can modify collection through for each loop if as StringBuilder type object of collection;
 * */
public class ForEachMutableTester {
    public static void main(String[] args) {

        /*
        * Since the loop variable receives the cloned copy as an object reference, enhanced The for statement can
        * be used to modify "mutating" elements (such as StringBuilder) using references to "cloned" objects;
        * */
        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("string_"));
        list.add(new StringBuilder("string_"));
        list.add(new StringBuilder("string_"));
        System.out.println(list);
        System.out.println("-------------");

        for (StringBuilder sb : list) {
            sb.append("updated");
            }
        System.out.println(list);


    }
}
