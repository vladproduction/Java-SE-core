package com.vladproduction.hiding_fields;

/**
 * NOTE IMPORTANT:
 * This example effectively demonstrates field shadowing in Java, where a subclass defines a field with the same name as one in its superclass.
 * The use of the super keyword allows access to the superclasses field, thereby resolving ambiguity and showcasing the potential
 * for confusion when shadowing occurs.
 * Field shadowing is generally discouraged as it can make the code less readable and lead to maintenance challenges.
 *
 * an example of field hiding (also known as shadowing) that demonstrates the concept with maxSpeed in the Vehicle class and its subclass Car.
 * In this example, the Car class will define its own maxSpeed field that shadows the maxSpeed field from the Vehicle class;
 * */
public class MainVehicleCarApp {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.showSpeed();

        Car car = new Car();
        car.showCarSpeed();

        //output:
        /*  Vehicle showSpeed()method of max speed: 100
            Car (subclass) max speed: 200
            Vehicle (superclass) max speed (using super): 100 */
    }
}
