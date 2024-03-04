package com.vladproduction.vp06_if;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    @Test
    void testIsLeapYearDivisibleBy400() {
        assertTrue(LeapYear.isLeapYear(1600));
        assertFalse(LeapYear.isLeapYear(1700));
    }

    @Test
    void testIsLeapYearDivisibleBy4ButNot100() {
        assertTrue(LeapYear.isLeapYear(2004));
        assertFalse(LeapYear.isLeapYear(1900));
    }

    @Test
    void testIsLeapYearNotDivisibleBy4() {

        assertFalse(LeapYear.isLeapYear(2023));
    }
}
