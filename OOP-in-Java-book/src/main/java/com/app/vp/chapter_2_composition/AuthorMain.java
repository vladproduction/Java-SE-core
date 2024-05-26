package com.app.vp.chapter_2_composition;

/**
 * Testing Author class
 * */
public class AuthorMain {
    public static void main(String[] args) {

        //creating instance
        Author author1 = new Author("Artur C.D.", "holmes@gmail.com");
        System.out.println("author1 = " + author1); //testing toString()

        //testing getters & setters
        author1.setEmail("sherlock@gmail.com");
        System.out.println(author1); //check updated email
        System.out.println("name: " + author1.getName());
        System.out.println("email: " + author1.getEmail());


    }
}
