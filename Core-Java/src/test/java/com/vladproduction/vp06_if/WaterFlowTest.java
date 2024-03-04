package com.vladproduction.vp06_if;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class WaterFlowTest {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final Logger logger = Logger.getLogger(String.valueOf(WaterFlowTest.class));

    @BeforeEach
    void setUp() {

        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {

        System.setOut(System.out);
    }

    @Test
    public void positive_test(){
        WaterFlow.waterFlowCapacity(15, 25);
        assertTrue(outContent.toString().contains("PIPE FLOW IS ALLOWED"));
        logger.info(String.valueOf(outContent));
    }

    @Test
    public void negative_test(){
        WaterFlow.waterFlowCapacity(15, 25);
        assertNotEquals("PIPE FLOW IS NOT ALLOWED", outContent.toString().trim());
        logger.info(String.valueOf(outContent));
    }

    @Test
    public void ifAllowedPipe(){
        WaterFlow.waterFlowCapacity(15, 20);
        assertTrue(outContent.toString().contains("PIPE FLOW IS ALLOWED"));
        logger.info(String.valueOf(outContent));
    }

    @Test
    public void ifNotAllowedPipe(){
        WaterFlow.waterFlowCapacity(15, 12);
        assertTrue(outContent.toString().contains("PIPE FLOW IS NOT ALLOWED"));
        logger.info(String.valueOf(outContent));
    }

    @Test
    public void ifAllowedTap(){
        WaterFlow.waterFlowCapacity(7, 20);
        assertTrue(outContent.toString().contains("PIPE FLOW IS ALLOWED"));
        logger.info(String.valueOf(outContent));
    }

    @Test
    public void ifNotAllowedTap(){
        WaterFlow.waterFlowCapacity(7, 3);
        assertTrue(outContent.toString().contains("PIPE FLOW IS NOT ALLOWED"));
        logger.info(String.valueOf(outContent));
    }


}