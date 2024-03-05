package com.vladproduction.vp20_constructor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class HumanTest {

    @Mock
    private Logger mockLogger;

    @Test
    public void testPrintInfo() {
        String expectedGender = "Female";
        String expectedName = "Alice";
        int expectedAge = 26;

        // Create a Human object with the mock logger
        Human human = new Human(expectedGender, expectedName, expectedAge, mockLogger);

        human.printInfo(); // Call the printInfo() method

        String expectedOutput = expectedGender + ", " + expectedName + ", " + expectedAge;

        // Verify that the mock logger was called with the expected output
        Mockito.verify(mockLogger).info(expectedOutput);

    }

}