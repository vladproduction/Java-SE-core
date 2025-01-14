package com.vladproduction.inheritance_runtime;

import com.vladproduction.collections_type_safety.Cat;

public class Animal implements Comparable<Animal>{

    public void makeSound(){
        System.out.println("Animal sound!");
    }

    @Override
    public int compareTo(Animal o) {
        if(o.getClass() == Animal.class){
            return 0;
        }
        if (o.getClass() == Cat.class) { //cat is less than dog
            return -1;
        }
        return 1; //dog is bigger than cat
    }

}
