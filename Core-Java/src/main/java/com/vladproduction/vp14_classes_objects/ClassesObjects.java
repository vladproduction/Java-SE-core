package com.vladproduction.vp14_classes_objects;

public class ClassesObjects {
    public static void main(String[] args) {

        //not good example, encapsulation rules violate; just to show
        PersonClass person1 = new PersonClass();
        person1.name = "John";
        person1.age = 25;
        System.out.println(person1.name + " " + person1.age);
        PersonClass person2 = new PersonClass();
        person2.name = "Jack";
        person2.age = 27;
        System.out.println(person2.name + " " + person2.age);


    }
}

class PersonClass{
    /*
    * class have:
    * 1)fields
    * 2)methods*/
    String name;
    int age;
}
