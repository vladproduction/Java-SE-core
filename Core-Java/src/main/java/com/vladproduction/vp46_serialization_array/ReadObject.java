package com.vladproduction.vp46_serialization_array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class ReadObject {
    public static void main(String[] args) {

//        readOneByOneFromArray();
        readArrayAsObject();


    }

    private static void readOneByOneFromArray() {
        try {
            FileInputStream fis = new FileInputStream("peoples.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int peopleAmount = ois.readInt();
            Person[] arr = new Person[peopleAmount];

            for (int i = 0; i < peopleAmount; i++) {
                arr[i] = (Person) ois.readObject();
            }


            System.out.println(Arrays.toString(arr));
            ois.close();
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readArrayAsObject() {
        try {
            FileInputStream fis = new FileInputStream("peoples.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] arr = (Person[])ois.readObject();

            System.out.println(Arrays.toString(arr));
            ois.close();
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
