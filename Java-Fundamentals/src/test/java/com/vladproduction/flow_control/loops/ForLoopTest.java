package com.vladproduction.flow_control.loops;

import org.junit.jupiter.api.Test;

import static com.vladproduction.flow_control.loops.ForLoop.*;
import static org.junit.jupiter.api.Assertions.*;

public class ForLoopTest {

    @Test
    public void testSumOfGivenEachNumberPositiveCases(){
        assertEquals(6, sumOfGivenEachNumber(3));
        assertEquals(10, sumOfGivenEachNumber(4));
        assertEquals(15, sumOfGivenEachNumber(5));
        assertEquals(4950, sumOfGivenEachNumber(99));
        assertEquals(5050, sumOfGivenEachNumber(100));
        assertEquals(5151, sumOfGivenEachNumber(101));
    }

    @Test
    public void testSumOfGivenEachNumberNegativeCases(){
        assertNotEquals(7, sumOfGivenEachNumber(3));
        assertNotEquals(11, sumOfGivenEachNumber(4));
    }


}