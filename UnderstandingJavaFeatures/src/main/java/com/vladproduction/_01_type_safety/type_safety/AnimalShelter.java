package com.vladproduction._01_type_safety.type_safety;



import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

    private List<Animal> animals;

    public AnimalShelter() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal); // Type-safe addition due to generics
    }

    public void makeAllSounds(){
        for (Animal animal : animals) {
            animal.makeSound(); // Polymorphic method call
        }
    }
}
