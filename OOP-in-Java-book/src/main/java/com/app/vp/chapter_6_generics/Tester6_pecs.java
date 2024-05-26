package com.app.vp.chapter_6_generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * List< ? extends X > doesn't allow to add anything, except for null into the list.
 *
 * List< ? super X > allows to add anything that is-a X (X or its subtype), or null.
 * */
public class Tester6_pecs {
    public static void main(String[] args) {

//        Getting an item from the list:

//        1)When you get an item from List< ? extends X >, you can assign it to a variable of type X or any supertype of X,
//        including Object.

        List<? extends Number> list1 = new ArrayList<Integer>();
        list1.add(null);  //OK
        Number n = list1.get(0);  //OK
        Serializable s = list1.get(0);  //OK
        Object o = list1.get(0);  //OK

        /*list1.add(2.3);  //ERROR
        list1.add(5);  //ERROR
        list1.add(new Object());  //ERROR
        Integer i = list1.get(0);  //ERROR*/

//        2)When you get an item from List< ? super X >, you can only assign it to a variable of type Object.

        List<? super Number> list2 = new ArrayList<Number>();
        list2.add(null);  //OK
        list2.add(2.3);  //OK
        list2.add(5);  //OK
        Object obj = list2.get(0);  //OK

        /*list2.add(new Object());  //ERROR
        Number n = list2.get(0);  //ERROR
        Serializable s = list2.get(0);  //ERROR
        Integer i = list2.get(0);  //ERROR*/
    }
}
