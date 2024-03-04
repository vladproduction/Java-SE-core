package com.vladproduction.vp04_while;



import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class WhileDemoTest {

    private static final Logger logger = Logger.getLogger(String.valueOf(WhileDemoTest.class));

    @Test
    public void test(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        WhileDemo.main(null);

        Scanner scanner = new Scanner(outContent.toString().trim());
        String[] expectedLines = new String[]{
                "x 0",
                "x 1",
                "x 2",
                "x 3",
                "x 4"
        };
        // all expected lines are present in outContent
        for (String expectedLine : expectedLines) {
            assertTrue(outContent.toString().contains(expectedLine));
        }

        scanner.close();
        logger.info("\n" + outContent);
        System.setOut(System.out);

    }
}