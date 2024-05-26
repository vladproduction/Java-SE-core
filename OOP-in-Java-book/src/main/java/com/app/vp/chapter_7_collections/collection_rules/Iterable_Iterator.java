package com.app.vp.chapter_7_collections.collection_rules;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterable<E> defining one method -iterator(); that iterator() return object Iterator which associated with Collections
 * and implementing interface Iterator<E>;
 * Iterator<E> declares three abstract methods:
 * -boolean hasNext(); return true if next element in collection is exist;
 * -next(); return next element of collection with type<E>;
 * -void remove(); //removing the last element returned by iterator()
 * */
public class Iterable_Iterator {
    public static void main(String[] args) {

        //while to iterate over elements with Iterator interface
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //an improved for loop that you can use
        //to iterate through the elements of a collection (as well as an array)
        for (Integer integer : list1) {
            System.out.println(integer);
        }
        /**
         The improved for loop offers a convenient way
         to iterate through the elements of the collection. However, it hides the interface
         Iterator, therefore you can NOT delete (via Iterator.remove()) or replace elements.
         * */
    }
}
