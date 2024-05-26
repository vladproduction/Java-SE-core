package com.app.vp.chapter_6_generics;

import java.util.List;

/**
 * What is the difference between List<?> and List<Object> in Java?
 * */
public class Tester4_diff_unKnow_object {

    //-------------------List<?>-----------------------------------------------
    class Animal{


    }
    private List<?> animals; // List of unknown elements (animals or something else)

    public void addAnimal(Animal animal) { // Cannot add elements, type is unknown
        // Compiler error: cannot add element of type Animal to List with unknown type
    }

    public Object getRandomAnimal() {
        int randomIndex = (int) (Math.random() * animals.size());
        return animals.get(randomIndex); // Read element as Object
    }

    //-------------------List<Object>-----------------------------------------------

    class MixedItems {
        private List<Object> items; // List of Objects

        public void addItem(Object item) {
            items.add(item); // Can add any object
        }

        public void processItems() {
            for (Object item : items) {
                // Need to cast if you want to use specific methods based on the actual type
                if (item instanceof String) {
                    String strItem = (String) item;
                    strItem.toUpperCase(); // Now you can use String methods
                }
                // ... handle other types similarly
            }
        }


    }

}
