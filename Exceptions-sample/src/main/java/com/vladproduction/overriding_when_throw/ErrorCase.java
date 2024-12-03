package com.vladproduction.overriding_when_throw;

import java.io.IOException;

/**
 * In this example, the ErrorCase class's doJob() method does not handle an exception of type IOException.
 * The Demo class inherits from the ErrorCase class and, when overriding the doJob() method,
 * specifies that it extends the Exception exception.
 * In other words, the subclass method can throw more than just I/O exceptions.
 * */
public class ErrorCase {
    public void doJob() throws IOException {
        //...
    }
    public static void main(String[] args) {
    }
}
//class Demo extends ErrorCase {
//    @Override
//    public void doJob() throws Exception { //overridden method does not throw 'java.lang.Exception'
//        //...
//    }
//}
