package com.vladproduction.access_outer_elements;

/**
 * The Boat class represents a boat with a color and a method to initiate rescue operations.
 *
 * Key Features:
 * - Contains a private field `color`, initialized to "White".
 * - The floating() method defines a local inner class LocalRescueBoat, which has access to the
 *   outer class's private members and local variables.
 * - The LocalRescueBoat class includes a method rescueBoatColor() that changes the boat's color
 *   and prints the color along with the capacity of the boat.
 */
public class Boat {
    private String color = "White";

    void floating(){ // start method
        int capacity = 1000; // variable as effectively final (not changeable)
        class LocalRescueBoat{
            public void rescueBoatColor(){
                color = "Orange"; // access to outer class field
                System.out.println("Rescue Boat color = " + color + ", Boat capacity = " + capacity); // access to local variable
            }
        }
        LocalRescueBoat rescueBoat = new LocalRescueBoat(); // create instance of the inner class
        rescueBoat.rescueBoatColor(); // call method to demonstrate functionality
    } // finish method

    public static void main(String[] args) {
        Boat boat = new Boat();
        boat.floating(); // Initiates floating method and showcases rescue boat functionality
    }

}

/*Description:
This implementation provides an example of how local inner classes can access private fields of the enclosing class
and local variables within their scope. The main method creates an instance of the Boat class and invokes the floating() method,
which demonstrates the functionality of the inner class LocalRescueBoat.
The output will show that the rescue boat has an updated color and display the boat's capacity.*/
