package com.app.vp.chapter_7_collections.collection_rules;

/**
 * Collection<E> is the root interface of the Collections framework.
 * It defines a common behavior for all classes;
 * All classes implements such sub-interfaces of Collection:
 *  -List<E>;
 *  -Set<E>;
 *  -Queue<E>;
 * */
public class Collection_Interface_Methods {
    public static void main(String[] args) {

        /*
        * main classic methods Collection<E>:
        * int size(); return amount
        * void clear(); remove all elements of this collection
        * boolean isEmpty(); check if this collection is not/or empty
        * boolean add(E elem); return true if element been added
        * boolean remove(Object elem); return true if element was removed
        * boolean contains(Object elem); return if collection has such element
        * */

        /*
        * methods to work with other collection:
        * boolean containsAll(Collection<?> c) c-collection that will be checked for adding
        * boolean addAll(Collection<? extends E> c) c-collection that will be adding to the end of current collection
        * boolean removeAll(Collection<?> c) leave elements of current collection
        * boolean equals(Object o) equal objects has the same hashCodes
        * int hashCode() return hashCode of the collection*/

        /*
        * methods to work with arrays:
        * Object[] toArray() return all elements of current collection of Object[] type
        * <T> T[] toArray(T[] a) return all elements of current collection of <T> type
        * */

    }
}
