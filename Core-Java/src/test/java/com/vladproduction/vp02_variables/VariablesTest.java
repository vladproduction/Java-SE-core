package com.vladproduction.vp02_variables;




import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VariablesTest {


    private static final Logger logger = Logger.getLogger(String.valueOf(VariablesTest.class));

    @Test
    public void test() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Variables.main(null);

        Scanner scanner = new Scanner(String.valueOf(outContent));

        String firstLine = scanner.nextLine();
        assertEquals(557, Integer.parseInt(firstLine));

        String secondLine = scanner.nextLine();
        assertEquals(100, Integer.parseInt(secondLine));

        logger.info("\n" + (outContent));
        scanner.close();
        System.setOut(System.out);


    }


}

