package com.vladproduction.collections_type_safety;

import com.vladproduction.inheritance_runtime.Animal;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

}
