package com.vladproduction.vp06_if;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import static com.vladproduction.vp06_if.FizzBuzz.counting;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private static final Logger logger = Logger.getLogger(String.valueOf(FizzBuzzTest.class));
    private final FizzBuzz fizzBuzz = new FizzBuzz();
    private static final String FIZZ = "FIZZ";
    private static final String BUZZ = "BUZZ";
    private static final String FIZZBUZZ = "FIZZBUZZ";

    @Test
    public void test_FIZZ(){
        byte[] expected = FIZZ.getBytes();
        byte[] actual = fizzBuzz.fizzbuzz(3);
        assertArrayEquals(expected,actual);
        logger.info(Arrays.toString(actual));
    }

    @Test
    public void test_BUZZ(){
        byte[] expected = BUZZ.getBytes();
        byte[] actual = fizzBuzz.fizzbuzz(5);
        assertArrayEquals(expected,actual);
        logger.info(Arrays.toString(actual));
    }

    @Test
    public void test_FIZZBUZZ(){
        byte[] expected = FIZZBUZZ.getBytes();
        byte[] actual = fizzBuzz.fizzbuzz(90);
        assertArrayEquals(expected,actual);
        logger.info(Arrays.toString(actual));
    }

    @Test
    public void countingTest(){

        int[][] testCases = {
                {15, 1, 4, 2},      // 15: 1 FizzBuzz, 4 Fizz, 2 Buzz
                {10, 0, 3, 2},      // 10: 0 FizzBuzz, 3 Fizz, 2 Buzz
                {3, 0, 1, 0},       //  3: 0 FizzBuzz, 1 Fizz, 0 Buzz
                {5, 0, 1, 1},       //  5: 0 FizzBuzz, 1 Fizz, 1 Buzz
                {95, 6, 25, 13},    // 95: 6 FizzBuzz, 25 Fizz, 13 Buzz
        };

        for (int[] testCase : testCases) {
            int number = testCase[0];
            Map<String, Integer> expectedMap = new HashMap<>();
            expectedMap.put("FIZZBUZZ", testCase[1]);
            expectedMap.put("FIZZ", testCase[2]);
            expectedMap.put("BUZZ", testCase[3]);

            // actual map
            Map<String, Integer> actualMap = counting(number);

            assertEquals(expectedMap, actualMap);
            logger.info(actualMap.toString());
        }
    }



}
