package com.vladproduction.oop.inheritance;

/**Inheritance is a mechanism where one class (subclass or derived class) inherits properties and
 behaviors (methods) from another class (superclass or base class). This promotes code reusability and
 establishes a hierarchical relationship between classes.*/

public class InheritanceDemo {
    public static void main(String[] args) {

        System.out.println("\tAnimalDog");
        Animal animal = new Dog();
        animal.eat();  // Inherited method
//        animal.bark(); // Subclass method not allowed based on type reference

        System.out.println("\tDog");
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method
        myDog.bark(); // Subclass method

        System.out.println("\tAnimalBigDog");
        Animal myBigDogAnimal = new BigDog();
        myBigDogAnimal.eat();  // Inherited method
//        myBigDogAnimal.bark(); // Subclass method not allowed based on type reference

        System.out.println("\tBigDog");
        Dog myBigDog = new BigDog();
        myBigDog.eat();  // Inherited method
        myBigDog.bark(); // Subclass method



    }
}

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class BigDog extends Dog {
    void eat() {
        System.out.println("The big dog eats food.");
    }
    void bark() {
        System.out.println("The big dog barks.");
    }
}
