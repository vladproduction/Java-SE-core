package com.vladproduction.vp20_constructor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class HumanObjectTest {
    @Mock
    private Logger mockLogger;
    @Test
    public void testConstructorGender(){
        String expectedGender = "Male";
        HumanObject human1 = new HumanObject(expectedGender);

        assertEquals(expectedGender, human1.getGender());
    }

    @Test
    public void testConstructorGender_Name(){
        String expectedGender = "Female";
        String expectedName = "Alice";
        HumanObject human2 = new HumanObject(expectedGender, expectedName);

        assertEquals(expectedGender, human2.getGender());
        assertEquals(expectedName, human2.getName());
    }
    @Test
    public void testPrintInfo(){
        String expectedGender = "Female";
        String expectedName = "Alice";
        int expectedAge = 26;
        HumanObject human3 = new HumanObject(expectedGender, expectedName, expectedAge, mockLogger);
        human3.printInfo();
        String expectedOutput = expectedGender + ", " + expectedName + ", " + expectedAge;

        Mockito.verify(mockLogger).info(expectedOutput);
    }

}