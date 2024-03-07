package com.vladproduction.vp28_access_modifiers;

import com.vladproduction.vp28_access_modifiers.package1.Person;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Main28 {

    public int id; //everywhere in project
    private String address; //only inside our class
    String name; //default available in bounds of the current package

    protected int number; //available in bounds of the current package and in classes been extended (by inheritance)


    public static void main(String[] args) {

        //public, private , default, protected

        Person person1 = new Person();
        person1.name = "John"; //public modifier work
//        person1.age = 100;   //private modifier work

        //constants are public, static and final (we want it to init once in the memory for our class)
        System.out.println(Person.CONSTANT_DEPARTMENT); //through name of the class
        String constant = person1.CONSTANT_DEPARTMENT; //through instance of the class

        System.out.println("-------------protected--------------");
        //protected
//        person1.bonus = 1500.0; //protected work (because from another package)
        PersonProtected person2 = new PersonProtected(1500.0);
        System.out.println(person2.bonus); //here we can use bonus field (in the same package)

        //but extended class can use protected field of parent class from another package:
        person2.setHiringYear(2023); //method which use protected field of Person.class
        System.out.println(person2);

    }

    private void technicalMethod(){ //only inside our class
    }
}
