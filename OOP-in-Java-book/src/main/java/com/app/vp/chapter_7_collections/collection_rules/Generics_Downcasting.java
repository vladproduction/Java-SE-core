package com.app.vp.chapter_7_collections.collection_rules;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generics_Downcasting {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(); //inform compiler that we have String type objects in this list
        strings.add("10");
        strings.add("B");
        strings.add("C");
        System.out.println(strings);

        System.out.println("-------------------");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String string = iterator.next();  //compiler making downcasting
            System.out.println(string);
        }
//        strings.add(123); //wrong type
//        Integer intObj = strings.get(0); //trying to get object and save it as Integer (error);
        //but we can wrap as Integer
        Integer intObj = Integer.valueOf(strings.get(0));//NumberFormatException
        System.out.println("intObj = " + intObj); //string has to be a number format to make it available

        System.out.println("-------------------");
        for (String string : strings) {
            System.out.println(string);
        }

        //Without Generics Compiler can not to check type of content of this list
        List list = new ArrayList();
        list.add("aaa");
        list.add(111);

    }
}
