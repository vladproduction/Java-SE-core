package com.app.vp.chapter_2_composition;

/**
 * Class Book is wool object in association with class Author
 * So, Book HAS-A Author
 * */
public class Book {

    private String name;
    private Author author;
    private double price;
    private int qty;

    //constructor (lets think the book was written by a single author)
    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    //getters & setters
    public String getName() {
        return name;
    }
    // setter for name comes from Author
    public Author getAuthor() {
        return author;
    }

    //setter for Author defined in this constructor
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return name + " - " + author; //author toString()
//        return "Book: " +name + "; author: " + author.getName() + ", " + author.getEmail() + ", price=" + price + ", qty=" + qty;
    }
}
