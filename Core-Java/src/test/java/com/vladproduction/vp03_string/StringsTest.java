package com.vladproduction.vp03_string;



import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringsTest {

    private static final Logger logger = Logger.getLogger(String.valueOf(StringsTest.class));

    @Test
    public void test(){

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Strings.main(null);

        Scanner scanner = new Scanner(String.valueOf(outContent));
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();

        assertEquals("Hello Bob", first, "first");
        assertEquals("Hello John", second, "second");
        assertEquals("Number: 5", third, "third");

        logger.info("\n" + String.valueOf(outContent));
        scanner.close();
        System.setOut(System.out);

    }

}