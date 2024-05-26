package com.app.vp.chapter_7_collections.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Modelling math set where no equivalent elements;
 * Possible only one element as 'null';
 * implemented classes:
 *  -HashSet<E>;
 *  -LinkedHashSet<E>;
 *  -TreeSet<E>;
 *
 * */
public class SetDemo {
    public static void main(String[] args) {

        //define Set object:
        Set<String> stringSet = new HashSet<>();
        //set declares the following abstract methods:
        stringSet.add("String1"); //adding element if such not present yet
        stringSet.add("String2"); //adding element if such not present yet
        stringSet.remove("String1"); //remove element if such is present in set
        System.out.println(stringSet.contains("String2")); //true if such element in set is contain (of false if not)

        //boolean addAll(Collection<? extends E> c) //create merging of sets
        //boolean retainAll(Collection<?> c) //create crossing of sets
    }
}
