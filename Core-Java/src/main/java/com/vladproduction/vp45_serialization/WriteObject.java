package com.vladproduction.vp45_serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class WriteObject {
    public static void main(String[] args) {
        //serialization - write to

        Person person1 = new Person(23, "John");
        Person person2 = new Person(25, "Jack");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("people.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
