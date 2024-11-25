package com.vladproduction.interfaces.extendsclassimplementsinterfaces;

/**
 * For example, let's describe the Call interface with a NUM field and an abstract call() method.
 * Let's describe the Base class as a superclass that has its own call() method from implementations.
 * Let's describe its subclass Client, which also implements the Call interface and overrides the call() method.
 * If you need to use an existing implementation of the inherited call() method from the Base class,
 * you can do this using the super keyword. In the MainBaseCallClientApp class, create a reference to the Call interface,
 * initialize it with an object of the Client class, and call the call() method on it.
 * What we get as a result:
 * the overridden call() method of the Client class is called,
 * which in turn calls the inherited call() method of the Base class.
 * */
public class MainBaseCallClientApp {
    public static void main(String[] args) {
        Call object = new Client();
        object.сall();

        /*сall() of class Client: NUM = 10
          сall() of class BASE: i = -5*/
    }
}
