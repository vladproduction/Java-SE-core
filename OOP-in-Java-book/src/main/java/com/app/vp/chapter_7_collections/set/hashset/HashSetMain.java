package com.app.vp.chapter_7_collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * Tester class for HashSet and Book as model;
 * */
public class HashSetMain {
    public static void main(String[] args) {

        //create books
        Book book1 = new Book(1, "Java");
        Book book1Duplicate = new Book(1, "Java");
        Book book2 = new Book(2, "Spring");
        Book book3 = new Book(3, "Angular");

        //declare set:
        Set<Book> books = new HashSet<>();

        //add elements
        books.add(book1);
        books.add(book1Duplicate);//not duplicates
        books.add(book1Duplicate);//not duplicates
        books.add(book2);
        books.add(book3);
        System.out.println("books = " + books); //testing toString()

        //add 'null' element
        books.add(null);
        books.add(null);//not duplicates
        System.out.println("books = " + books);

        //remove element as object
        books.remove(book1);
        System.out.println("books = " + books);

        //trying to merge two sets:
        //create a new set
        Set<Book> booksSet2 = new HashSet<>();
        //add content to set2:
        booksSet2.add(book1);
        System.out.println("booksSet2 = " + booksSet2); //check if were have content
        //books + booksSet2
        books.addAll(booksSet2);
        System.out.println("books = " + books);//check after merge

        //remove 'null'
        books.remove(null);
        System.out.println("books = " + books);//expected: null removed

        //trying to find any retains of two sets:
        books.retainAll(booksSet2);
        System.out.println("books = " + books); //printing after retain; expected: '1:Java'


    }
}
