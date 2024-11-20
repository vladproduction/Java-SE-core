package com.vladproduction.designer_chains.contr3;

/**
 * This design illustrates the fundamental principles of constructor chaining and inheritance in Java.
 * When creating an instance of Track, the default Vehicle constructor is invoked automatically since the Track constructor
 * does not specify which constructor to use from its superclass.
 * This ensures appropriate initialization for both the Vehicle and Track classes.
 *
 * when a subclass does not explicitly call a superclass constructor in its own constructor,
 * the Java compiler automatically calls the default constructor of the superclass if it exists.
 * */
public class MainVehicleTrackApp {
    public static void main(String[] args) {

        Track track = new Track("Track");
        //output:
        /*Vehicle default constructor
        Track constructor*/

        /*the behavior of the Java compiler automatically inserting a call to the no-argument constructor
        of the superclass is essential for maintaining the integrity of object creation and initialization.*/
    }
}

