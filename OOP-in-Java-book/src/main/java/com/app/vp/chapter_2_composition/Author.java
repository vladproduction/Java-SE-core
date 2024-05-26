package com.app.vp.chapter_2_composition;

/**
 * This class associates to the class Book
 * */
public class Author {

    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //no setter for name, objects are created in such a way that they cannot be changed
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * overridden toString()
     * @return String human-readable value
     * */
    @Override
    public String toString() {
        return name + ", " + email;
    }
}
