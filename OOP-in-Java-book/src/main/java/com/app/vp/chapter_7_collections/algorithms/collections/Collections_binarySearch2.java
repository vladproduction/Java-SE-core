package com.app.vp.chapter_7_collections.algorithms.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_binarySearch2 {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Pride and Prejudice", "Jane Austen"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien"));

        // Sort the list by author using the comparator
        Collections.sort(books, new BookByAuthorComparator());

        Book targetBook = new Book("The Catcher in the Rye", "J.D. Salinger"); // Book to search for

        // Search for the target book using binary search with the comparator
        int index = Collections.binarySearch(books, targetBook, new BookByAuthorComparator());

        if (index >= 0) {
            System.out.println("Book found at index: " + index);
            System.out.println(books.get(index));
        } else {
            System.out.println("Book not found in the list.");
        }

    }

    static class BookByAuthorComparator implements Comparator<Book> {

        @Override
        public int compare(Book book1, Book book2) {
            return book1.getAuthor().compareTo(book2.getAuthor()); // Sort by author (ascending)
        }
    }
}
