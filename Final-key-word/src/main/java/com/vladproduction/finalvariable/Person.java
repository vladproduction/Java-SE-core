package com.vladproduction.finalvariable;

import java.util.ArrayList;

public class Person {

    private final ArrayList friends = new ArrayList();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public ArrayList getFriends() {
        return friends;
    }

    public void addFriendToList(Person person){
        friends.add(person);
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Bob");
        Person person3 = new Person("Holly");

        person3.addFriendToList(person1);
        person3.addFriendToList(person2);
        System.out.println("Friends list of " + person3 + ": " + person3.getFriends()); //Friends list: [John, Bob]
    }
}
