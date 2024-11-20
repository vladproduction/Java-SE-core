package com.vladproduction.demo;

public class MainPersonStudentApp {
    public static void main(String[] args) {

        Person person = new Student ();
        System.out.println(person.version);//Person
        System.out.println(((Student)person).version);//Student

    }
}
