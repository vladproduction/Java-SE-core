package com.vladproduction.vp46_serialization_array;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class WriteObject {
    public static void main(String[] args) {

//        oneByOneInArray();
        writeArrayAsObject();

    }

    private static void oneByOneInArray() {
        Person person1 = new Person(1, "John", 26);
        Person person2 = new Person(2, "Jack", 28);
        Person person3 = new Person(3, "Bob", 27);
        Person [] peoples = {person1, person2, person3};

        try {
            FileOutputStream fos = new FileOutputStream("peoples.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(peoples.length);
            for (Person people : peoples) {
                oos.writeObject(people);
            }

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeArrayAsObject() {
        Person person10 = new Person(10, "John", 26);
        Person person20 = new Person(20, "Jack", 28);
        Person person30 = new Person(30, "Bob", 27);
        Person [] peoples = {person10, person20, person30};

        try {
            FileOutputStream fos = new FileOutputStream("peoples.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(peoples);


            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
