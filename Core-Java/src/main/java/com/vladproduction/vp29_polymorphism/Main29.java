package com.vladproduction.vp29_polymorphism;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Main29 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        dog.eat();

        //----------------------------------------------------
        System.out.println("-----------------------");
        Animal animal1 = new Dog(); //------------->Dog as Animal
        animal1.eat(); //still have access
//        animal1.bark(); //not access
        Dog dog1 = new Dog();       //------------->Dog as Dog
        dog1.eat();// both methods available
        dog1.bark();

        //--------late relation--------------------------------------------
        System.out.println("-----late relation-----");
        //we create method in Dog class and override it (method eat() from parent class)
        Animal animal2 = new Dog();
        animal2.eat(); //took from the closest class (and it`s Dog); if not exist? --> took from parent
        Dog dog2 = new Dog();
        dog2.eat();

        //---------different types in method if one parent------------------
        System.out.println("--------different types in method if one parent----------");
        Animal animal_animal = new Animal();
        Dog dog_dog = new Dog();
        Cat cat_cat = new Cat();
        test(animal_animal);
        test(dog_dog);
        test(cat_cat);

    }
    public static void test(Animal animal){ //all child include because they are extends from parent
        animal.eat();
    }
}
