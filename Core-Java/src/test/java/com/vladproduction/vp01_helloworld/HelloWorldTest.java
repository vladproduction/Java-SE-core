package com.vladproduction.vp01_helloworld;



import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloWorldTest {

    private static final Logger logger = Logger.getLogger(String.valueOf(HelloWorldTest.class));

    @Test
    public void test(){

        // This line captures the output of the System.out.print statement
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the main method to execute the code
        HelloWorld.main(null);

        // Assert that the captured output contains the expected string
        assertEquals("Hello World!", outContent.toString());

        logger.info("Captured output: outContent.toString() = " + outContent);

        // Reset the system output stream
        System.setOut(System.out);

    }

}