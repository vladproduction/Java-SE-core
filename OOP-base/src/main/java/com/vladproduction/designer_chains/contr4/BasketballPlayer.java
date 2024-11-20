package com.vladproduction.designer_chains.contr4;

public class BasketballPlayer extends Player{


    public BasketballPlayer(String name){
        super(name); // Call to the Player constructor with the name parameter
        System.out.println("BasketballPlayer constructor name: " + name);
    }
    //the error occurs in case absence of default constructor for superclass
    /*Since the BasketballPlayer constructor does not include a call to super(name)
    to call the superclass constructor that takes a String, a compilation error occurs.*/

    //if we`re need to have access to parent class
    //super(name); // Call to the Player constructor with the name parameter  --->  avoid error

    //or we can have default constructor in parent class and do not invoke super(name) constructor with parameters --->  avoid error


}
