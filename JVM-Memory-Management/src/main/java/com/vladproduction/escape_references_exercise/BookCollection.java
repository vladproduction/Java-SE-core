package com.vladproduction.escape_references_exercise;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {

    private List<Book> books;

    public BookCollection() {
        books = new ArrayList<Book>();
        books.add(new Book(1, "To Kill a Mockingbird", "Harper Lee", 10.99));
        books.add(new Book(2, "1984", "George Orwell", 8.99));
        books.add(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald", 12.50));
        books.add(new Book(4, "The Catcher in the Rye", "J.D. Salinger", 9.99));
        books.add(new Book(5, "Pride and Prejudice", "Jane Austen", 7.99));
        books.add(new Book(6, "The Hobbit", "J.R.R. Tolkien", 14.99));
        books.add(new Book(7, "Moby Dick", "Herman Melville", 11.50));
        books.add(new Book(8, "War and Peace", "Leo Tolstoy", 19.00));
        books.add(new Book(9, "The Alchemist", "Paulo Coelho", 15.90));
        books.add(new Book(10, "The Picture of Dorian Gray", "Oscar Wilde", 13.75));
    }

    //todo: remove escaping reference (we need to check if Book is immutable class, because we return book here)
    public BookReadOnly findBookByTitle(String title) {
        for (BookReadOnly book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    //forEach:
    /*public void printAllBooks() {
        for (BookReadOnly book : books) {
            System.out.println(book.getTitle() + ": " + book.getPrice());
        }
    }*/
    //stream:
    public void printAllBooks() {
        books.stream().map(book -> book.getTitle() + ": " + book.getPrice()).forEach(System.out::println);
    }

}
