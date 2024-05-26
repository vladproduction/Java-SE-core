package com.app.vp.chapter_7_collections.set.linkedhashset;

import com.app.vp.chapter_7_collections.set.hashset.Book;

import java.util.Set;

/**
 * Tester for LinkedHashSet class;
 * LinkedHashSet builds a connected list using a hash table to increase the efficiency of element
 * insertion and deletion operations;
 * supports linked list elements in the order in which they were inserted, i.e. in the order of the add() method.
 * */
public class LinkedHashSet {
    public static void main(String[] args) {

        //creating content:
        Book book1 = new Book(1, "Java");
        Book book2 = new Book(2, "Spring");
        Book book3 = new Book(3, "Angular");
        Book book3Duplicate = new Book(3, "Angular");
        Book book4 = new Book(4, "AI");


        //declare set:
        Set<Book> books = new java.util.LinkedHashSet<>();
        books.add(book1);
        books.add(book4);
        books.add(book1); //no duplicate
        books.add(book2);
        books.add(book3);
        books.add(book3Duplicate);
        books.add(null);
        books.add(null);//no duplicate

        //check the order of adding:
        System.out.println("books = " + books); //expected: 1:Java, 4:AI, 2:Spring, 3:Angular, null



    }
}
