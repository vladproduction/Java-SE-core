package com.vladproduction.vp20_constructor;

import java.util.logging.Logger;

public class Main20 {
    private Logger logger;

    public static void main(String[] args) {

        HumanObject humanObject = new HumanObject();

        HumanObject human1 = new HumanObject("Male");
        human1.printGender();

        HumanObject human2 = new HumanObject("Male", "John");
        human2.printGender();
        human2.printName();

        HumanObject human3 = new HumanObject("Male", "John", 28, Logger.getLogger(String.valueOf(HumanObject.class)));
        human3.printGender();
        human3.printName();
        human3.printAge();
        human3.printInfo();








    }
}
