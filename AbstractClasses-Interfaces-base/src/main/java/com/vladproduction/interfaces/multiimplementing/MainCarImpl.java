package com.vladproduction.interfaces.multiimplementing;

/**
 * In this example, the described CarImpl class implements several interfaces
 * Drivable (car drive), Repairing (repair), Parking (parking).
 * Depending on which reference we access the object through, we immediately clearly define the set of actions
 * that we want to perform with this object.
 * For example, when accessing a reference of type Parking, we are only interested in performing parking actions.
 * */
public class MainCarImpl {
    public static void main(String[] args) {
        Drivable сar = new CarImpl();
        Repairing repairing = (Repairing) сar;
        Parking parking = (Parking) сar;
    }
}
