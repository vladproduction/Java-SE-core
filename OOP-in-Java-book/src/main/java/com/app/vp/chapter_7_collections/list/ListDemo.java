package com.app.vp.chapter_7_collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * methods from super Interface Collections and Iterable and:
 * adding, removing, accessing elements by index, and iterating through the list*/
public class ListDemo {
    public static void main(String[] args) {

        /*
        * Including abstract methods coming from super Interface List has:
        * -void add(int index, E element) adding element by index
        * -E set(int index, E element) updating element by index
        * -E get(int index) getting by index not removing
        * -E remove(int index) remove by index
        * -int indexOf(Object obj) return index of the specified element
        * -int lastIndexOf(Object obj) return  index of the last occurrence of the specified element
        * -fromIndex() include
        * -toIndex() exclude
        * */

        /*
        The abstract superclass AbstractList provides implementations for many of the abstract methods declared in
        the List, Collection, and Iterable interfaces.
        However, some methods, e.g.like get(int index), remain abstract.
        These methods will be implemented in concrete subclasses such as ArrayList and Vector.
        */

        /*
         * Conclusion:
         * -one-dimensional array with variable dimensions;
         * -accessible by index;
         * -remove or add by index (int index);
         * -can hold repeatable elements;
         * -can hold 'null';
         * -can do searching by tracking sequentially by elements;
         * -can do operations for variables in chosen range of values;
         * */


    }
}
