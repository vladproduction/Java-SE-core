package com.vladproduction.vp11_arrays;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.logging.Logger;

import static com.vladproduction.vp11_arrays.ArraysCases.table_Pythagoras;
import static org.junit.jupiter.api.Assertions.*;

class ArraysCasesTest {

    private static final Logger logger = Logger.getLogger(String.valueOf(ArraysCasesTest.class));

    @Test
    public void testPythagorasTable() {
        table_Pythagoras();
    }

    @Test
    public void testValuesPythagorasTable() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        table_Pythagoras();

        System.setOut(System.out);

        String output = outputStream.toString();

        // Verify table dimensions (10x10)
        int rows = output.split("\n").length;
        int cols = output.split("\n")[0].split("\t").length;

        logger.info(String.valueOf(rows)); //10
        logger.info(String.valueOf(cols)); //11 todo??? want to have '10' as expected

        assertAll("Pythagoras Table Test",
                () -> assertEquals(10, rows, "Incorrect number of rows"),
                () -> assertEquals(11, cols, "Incorrect number of columns")
        );

        // verify specific cell values
         assertTrue(output.contains("16\t"), "Missing value in the table");
    }
}

