package com.app.vp.chapter_7_collections.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector v = new Vector(3, 2);
        System.out.println("v.size() = " + v.size());
        System.out.println("v.capacity() = " + v.capacity());

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        System.out.println("v.capacity() after add 4 elements = " + v.capacity());

        v.add(5.5);
        System.out.println("current v.capacity() = " + v.capacity());

        v.add(6);
        v.add(7);
        System.out.println("current v.capacity() = " + v.capacity());

        v.add(0.8);
        v.add(9.99);
        System.out.println("current v.capacity() = " + v.capacity());

        //first element:
        Object firstElement = v.firstElement();
        System.out.println("firstElement = " + firstElement);

        //last element:
        Object lastElement = v.lastElement();
        System.out.println("lastElement = " + lastElement);

        if(v.contains(5.5)){
            System.out.println("5.5 is a element with index 4 ? - " + v.get(4));
        }

        System.out.println("--------enumeration:---------");
        //enumeration:
        Enumeration vEnum = v.elements();
        System.out.println("Elements of vector: ");
        while (vEnum.hasMoreElements()){
            System.out.print(vEnum.nextElement() + "; ");
        }
        System.out.println();

        System.out.println("--------iterator:---------");
        //possible to use iterator for vector:
        Iterator iterator = v.iterator();
        System.out.println("Elements of vector: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "; ");
        }
        System.out.println();


    }
}
