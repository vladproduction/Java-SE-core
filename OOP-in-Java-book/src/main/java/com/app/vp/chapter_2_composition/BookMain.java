package com.app.vp.chapter_2_composition;

/**
 * Testing Book class and association with Author
 *  part-1: Author as separate object
 *  part-2: Author as anonymous instantiation
 * */
public class BookMain {
    public static void main(String[] args) {

        //part-1

        //creating Author first and Book with this Author
        Author author1 = new Author("John Doe", "doe@gmail.com");
        System.out.println("author1 = " + author1); //testing toString()
        Book book1 = new Book("Titanic", author1, 20.0, 500);
        System.out.println("book1 = " + book1); //testing toString()

        //testing getters & setters for Author
        author1.setEmail("johnDoe@gmail.com");
        System.out.println(author1); //data has to be updated
        System.out.println(author1.getName());
        System.out.println(author1.getEmail());

        //testing getters & setters for Book
        book1.setPrice(50.0);
        book1.setQty(1000);
        System.out.println(book1.getName());
        System.out.println(book1.getPrice());
        System.out.println(book1.getQty());
        System.out.println(book1.getAuthor().getName());
        System.out.println(book1.getAuthor().getEmail());

        //part-2

        Book book2 = new Book("Inter", new Author("Rosso", "inter@gmail.com"), 200.0, 320);
        System.out.println("book2 = " + book2); //toString()



    }
}
