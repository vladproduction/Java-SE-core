package com.vladproduction.vp14_classes_objects;

public class ObjectsReferences {
    public static void main(String[] args) {

        Clothing[] clothes = {
                new Clothing(),
                new Clothing()
        };

        clothes[0].description = "Jacket";
        clothes[1].description = "Socks";
        clothes[0].description = clothes[1].description; //changed to Socks instead of Jacket
        System.out.print(clothes[0].description + " "); //Socks

        clothes[1].description = "Hat"; //changed to Hat instead of Socks
        System.out.print(clothes[0].description + " "); //Socks is still

        clothes[0] = clothes[1]; // changed references: Hat instead of Socks is on the [0] position
        System.out.print(clothes[0].description); // Hat

        //the expected output totally (after print()):
        // Socks Socks Hat


    }

}

class Clothing{
    public String description;

}
