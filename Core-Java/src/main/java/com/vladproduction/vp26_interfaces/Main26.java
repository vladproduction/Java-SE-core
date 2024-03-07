package com.vladproduction.vp26_interfaces;



/**
 * Created by vladproduction on 06-Mar-24
 */

public class Main26 {
    public static void main(String[] args) {

        Animal animal1 = new Animal(1);
        Person person1 = new Person("John");

        animal1.sleep();

        person1.sayHello();

        //if we want this two classes be related (some common behaviour)
        //creating interface Info
        //with common method showInfo()
        animal1.showInfo();
        person1.showInfo();

        //----------substitution:----------------------
        System.out.println("-----substitution:-----");
        Info info1 = new Animal(1);
        Info info2 = new Person("Jack");
        //such combination is possible, because our classes implements interface Info;
        info1.showInfo();
        info2.showInfo();
        //in that case we are considering Object of our class Animal/Person not like a class object,
        //but like a something what implements interface Info and method showInfo();

        //---------------using interface as parameter in method:------------:
        System.out.println("------interface as parameter in method:----");
        //it is possible because our classes is interfaces related (or depending on)
        outputInfo(info1);
        outputInfo(info2);
        System.out.println("--------------");
        //as arguments in this method we can set Class as well, because they are implements interface,
        //and this interface is same as our classes implements;
        outputInfo(person1);
        outputInfo(animal1);
    }

    public static void outputInfo(Info info){
        info.showInfo();
    }
}
