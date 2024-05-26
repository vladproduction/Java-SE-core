package com.app.vp.chapter_7_collections.list.vector;

/**
 * Class Vector implements array of objects
 * -possible to get by index;
 * -vector size grow or shrink depending on addition
 * or removing elements after the Vector has already been created;
 * -internally synchronized;
 * */
public class Vector_impl {
    public static void main(String[] args) {

        /*
        * Vector:
        *
        *       Constructors:
        * -Vector() – creates an empty vector so that the inner the array has size 10 and its standard volume increment is zero;
        * -Vector(Collection<? extends E> c) – creates a vector containing the elements of the specified
        * collection in the order returned iterator;
        * -Vector(int initialCapacity) – creates an empty vector with the specified initial volume and with a standard
        * volume increment equal to zero;
        * -Vector(int initialCapacity, int capacityIncrement) – creates an empty vector with the specified initial
        * capacity and increment volume;
        *
        *       Methods:
        *   -void addElement(E obj) – adds the specified component to the end of the vector, increasing its size by 1;
            -boolean removeElement(Object obj) – removes the first one, i.e. having the minimum index, the encountered
            argument from the vector;
            -void setElementAt(E obj, int index) – inserts an element representing the specified object at the location
            in the vector specified by the index;
            -public E elementAt(int index) – returns the element with the specified index; this method is identical
            to the get(int) method that is part of the List interface;
            -public E firstElement() – returns the first element (with index 0) of the given vector;
            -public E lastElement() – returns the last element of the vector;
            -public void insertElementAt(E obj,int index) – inserts the specified object as an element of the given
            vector at the location specified index. Each element of a given vector with an index greater than
            or equal to the specified index, gets an index greater than the previous one by 1.
        * */

    }

}
