package com.app.vp.chapter_7_collections.set.treeset;

import java.util.TreeSet;

/**
 * Tester class of TreeSet;
 * */
public class TreeSet_comparable {
    public static void main(String[] args) {

        //create content:
        AddressBookEntry address1 = new AddressBookEntry("A");
        AddressBookEntry address2 = new AddressBookEntry("B");
        AddressBookEntry address3 = new AddressBookEntry("C");
        AddressBookEntry address4 = new AddressBookEntry("D");

        //create treeSet
        TreeSet<AddressBookEntry> treeSet = new TreeSet<>();
        treeSet.add(address1);
        treeSet.add(address2);
        treeSet.add(address3);
        treeSet.add(address4);
        System.out.println("treeSet = " + treeSet); //test toString() to see content

        //methods:
        System.out.println(treeSet.floor(address2));//Adam
        System.out.println(treeSet.lower(address2));
        System.out.println(treeSet.headSet(address2));
        System.out.println(treeSet.tailSet(address2));

    }
}
