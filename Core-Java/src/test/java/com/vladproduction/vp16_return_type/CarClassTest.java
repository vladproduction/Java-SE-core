package com.vladproduction.vp16_return_type;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarClassTest {

    @Test
    public void correctCalculateYearsToServiceTest(){
        CarClass carClass = new CarClass();
        carClass.year = 2020;
        int expectedYear = carClass.calculateYearsToService();
        //int years = 2050 - year; (calculateYearsToService())
        int actualYears = 2050 - carClass.year;

        assertEquals(expectedYear, actualYears);
    }

}