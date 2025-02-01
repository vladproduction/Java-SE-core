package com.vladproduction.escape_references_exercise;

public class MainBooksApp {
    public static void main(String[] args) {

        //instantiating list of books
        BookCollection bookCollection = new BookCollection();

        System.out.println("Before:");
        bookCollection.printAllBooks();

        System.out.println("\nget price of book The Alchemist in EUR:");
        //get price of book The Alchemist in EUR
        System.out.println(bookCollection.findBookByTitle("The Alchemist").getPrice().convert("EUR"));

        bookCollection.findBookByTitle("The Alchemist");
        System.out.println("\nAfter:");
        bookCollection.printAllBooks();

    }
}
