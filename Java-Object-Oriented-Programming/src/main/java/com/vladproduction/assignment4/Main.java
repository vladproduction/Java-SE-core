package com.vladproduction.assignment4;

public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact("John", new PhoneNumber(77, "21656"), "john@email.com");
        Contact contact2 = new Contact("Bob", new PhoneNumber("7723584"), "bob@email.com");
        Contact contact3= new Contact("Tony", new PhoneNumber("7731285"));
        Contact contact4 = new Contact("Nick", new PhoneNumber("45689"), "nick@email.com");

        System.out.println(contact1);
        System.out.println(contact2);
        System.out.println(contact3);
        System.out.println(contact4);
    }
}
