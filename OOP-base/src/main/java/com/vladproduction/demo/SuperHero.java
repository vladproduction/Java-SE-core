package com.vladproduction.demo;

public class SuperHero extends Hero{

    String skills;

    /**
     * two parameters: skills and name but only assigns the value to the skills field
     * line super(); calls the default constructor of the Hero class, which does nothing and doesn't set the name field.
     * Since the name field is never assigned a value in the SuperHero constructor, it remains null.
     * */
    /*public SuperHero(String skills, String name){
        super();
        this.skills = skills;
    }*/

    //the correct solution is:
    public SuperHero(String skills, String name) {
        super(); // Calls the superclass constructor
        this.name = name; // Assigning the name parameter to the inherited field
        this.skills = skills;
    }

    /**
     * returns a string that combines the name from the Hero class and the skills from the SuperHero class
     * */
    public String showInfo(){
        return name + " has " + skills;
    }

}
