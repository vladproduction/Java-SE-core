package com.vladproduction.escape_references_exercise;

/**
 * read-only class (immutable), we have no any setters here
 * but if we have some mutator method, like to change title value;
 * we have to refactor Book class into interface format: BookReadOnly;
 * */
public class Book implements BookReadOnly {

    private int id;
    private String title;
    private String author;
    private Price price;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    //mutator method
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    public Book(int id, String title, String author, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = new Price(price);
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }

    //todo: remove escaping reference
    //fixed: price is now immutable
    @Override
    public Price getPrice() {
        return this.price;
    }
}
