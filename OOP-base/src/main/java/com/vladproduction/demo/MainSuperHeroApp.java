package com.vladproduction.demo;

/**
 * for this output lies in how the SuperHero class is initialized and how the name field of the Hero class is used.
 * However, within the constructor, not assign the name parameter to the name field of the Hero class.
 * Therefore, even though created the object with the parameters "vision" (for skills) and "Kent" (for name),
 * the name field is still null.
 *
 * //change correct solution:
 * ensures that name is initialized correctly, and the output reflects the intended information.
 * */
public class MainSuperHeroApp {
    public static void main(String[] args) {
        SuperHero superHero = new SuperHero("vision", "Kent");
        System.out.println(superHero.showInfo()); //null has vision

        //after correct solution the output is:
        //Kent has vision
    }
}
