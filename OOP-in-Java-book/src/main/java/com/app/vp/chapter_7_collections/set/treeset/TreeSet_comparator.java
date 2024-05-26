package com.app.vp.chapter_7_collections.set.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Tester TreeSet_comparator class;
 * PhoneBookEntry not implements Comparator, can not use method add();
 * We specify Comparator for model class and based on that do creating TreeSet;
 * */
public class TreeSet_comparator {

    public static void main(String[] args) {

        //create content
        PhoneBookEntry phone1 = new PhoneBookEntry("phone1");
        PhoneBookEntry phone2 = new PhoneBookEntry("phone2");
        PhoneBookEntry phone3 = new PhoneBookEntry("phone3");

        //define comparator
        Comparator<PhoneBookEntry> comp = new PhoneBookComparator();

        //define set
        TreeSet<PhoneBookEntry> set = new TreeSet<>(comp);

        //add content to the set (no matter how we add; result we got depends on comparator)
        set.add(phone2);
        set.add(phone1);
        set.add(phone3);

        //printing treeSet
        System.out.println(set);

        //set in descending order (define new set as set.descendingSet())
        Set<PhoneBookEntry> newSet = set.descendingSet();
        System.out.println(newSet);

    }

    public static class PhoneBookComparator implements Comparator<PhoneBookEntry>{
        @Override
        public int compare(PhoneBookEntry o1, PhoneBookEntry o2) {

            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    }
}
