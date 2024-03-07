package com.vladproduction.vp24_object_and_toString;

public class Main24 {
    public static void main(String[] args) throws InterruptedException {

        String string = "Hello";
        System.out.println(string); //Hello

        Fish fish = new Fish("Carp", 2.7);
        System.out.println(fish); //Fish@119d7047 --> when not overridden toString();
        /** System.out.println("--------some methods from Object.class--------------------");
        fish.toString();
        fish.equals("other object");
        fish.hashCode();
        fish.getClass();
        fish.wait();
        fish.notify();
        fish.notifyAll();
            * all classes extend from class Object;
            *  it allowed to override some of its methods for example: (toString(), equals(), hashcode())*/
        //if we want to see other presentation of our object, we have to override toString() for our Fish.class
        //now after overriding:
        System.out.println(fish); //Fish: Carp, weight=2.7


    }
}

class Fish{
    private String type;
    private double weight;

    public Fish(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public String toString() {
        return "Fish: " + type  + ", weight=" + weight;
    }
}
