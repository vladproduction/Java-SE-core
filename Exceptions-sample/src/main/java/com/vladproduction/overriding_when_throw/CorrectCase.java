package com.vladproduction.overriding_when_throw;

import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * In this example, the CorrectCase class's doJob() method does not handle an exception of type IOException.
 * The Test class inherits from the CorrectCase class and, by overriding the doJob() method, specifies that
 * it extends the FileNotFoundException exception.
 * In other words, the subclass method indicates that it can throw a more specific I/O-related exception.
 * In our case it is FileNotFoundException.
 * */
public class CorrectCase {
    public void doWork() throws IOException {
        System.out.println("doWork-CorrectCase-IOException... run");
    }
    public static void main(String[] args) {
        CorrectCase correctCaseInstance = new CorrectCase();
        Test testInstance = new Test();

        try {
            correctCaseInstance.doWork(); // Calls the method from CorrectCase
        } catch (IOException e) {
            System.out.println("IOException caught in CorrectCase: " + e.getMessage());
        }

        try {
            testInstance.doWork(); // Calls the overridden method from Test
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught in Test: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught in Test: " + e.getMessage());
        }
    }
    //output:
    /*doWork-CorrectCase-IOException... run
    doWork-Test-FileNotFoundException... run*/
}
class Test extends CorrectCase {
    @Override
    public void doWork() throws FileNotFoundException {
        System.out.println("doWork-Test-FileNotFoundException... run");
    }
}



