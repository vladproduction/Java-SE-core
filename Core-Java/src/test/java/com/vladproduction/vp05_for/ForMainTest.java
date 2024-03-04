package com.vladproduction.vp05_for;




import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ForMainTest {

    @Test
    public void incrementTest() {
        String[] expectedLines = {"1", "2", "3", "4"};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ForMain.increment(4);
        System.setOut(System.out);

        String outContent = outputStream.toString().trim();
        for (String expectedLine : expectedLines) {
            assertTrue(outContent.contains(expectedLine));
        }

    }

    @Test
    public void decrementTest() {

        String[] expectedLines = {"10", "8", "6", "4", "2"};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ForMain.decrement(10, 2);
        System.setOut(System.out);

        String outContent = outputStream.toString().trim();
        for (String expectedLine : expectedLines) {
            assertTrue(outContent.contains(expectedLine));
        }

    }

}