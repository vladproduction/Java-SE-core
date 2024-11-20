package com.vladproduction.override_methods_cases;

/**
 * It is not always necessary for a subclass to completely replace the body of an inherited superclass method.
 * It may only be necessary to supplement it. To do this, when overriding a method, you can refer to the superclass method using super.
 *
 * It is worth noting that if there are more than two classes in the inheritance chain, then the reference through the super keyword always refers
 * to the closest/immediate superclass.
 * */
public class DerivedPartially extends Base{

    @Override
    public void show() {
        super.show(); //explicitly invoke
        System.out.println("DerivedPartially class");
    }
}
