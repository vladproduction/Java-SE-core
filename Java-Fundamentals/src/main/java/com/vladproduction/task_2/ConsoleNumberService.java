package com.vladproduction.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Task. Enter n numbers from the console.
 * 1. Find the shortest and longest numbers. Output the numbers found and their length.
 * 2. Output the numbers in ascending (descending) order of their length values.
 * 3. Output to the console those numbers whose length is less (greater) than the average length for all numbers, as well as the length.
 * 4. Find the number in which the number of different digits is minimal. If there are several such numbers, find the first of them.
 * 5. Find the number of numbers containing only even digits, and among the remaining ones, the number of numbers with an equal number of even and odd digits.
 * 6. Find a number in which the digits are in strict ascending order. If there are several such numbers, find the first of them.
 * 7. Find a number consisting only of different digits. If there are several such numbers, find the first of them.
 */
public class ConsoleNumberService {
    public static void main(String[] args) {

        //assume we have String[] args = {"10", "1", "23", "555", "1001", "0", "18", "5"}

        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        //1)Find the shortest and longest numbers. Output the numbers found and their length.
        printNumbers(array);
        printNumbersLength(args);
        longestNumberByLength(args);
        shortestNumberByLength(args);

        //2)Output the numbers in ascending (descending) order of their length values.
        printNumbersLengthAsc(args);
        printNumbersLengthDesc(args);

        //3)Output to the console those numbers whose length is less (greater) than the average length for all numbers, as well as the length.
        averageLengthNumbers(args);
        numbersValuesLessAvgLength(args);
        numbersValuesGreaterAvgLength(args);
        numbersValuesBothCases(args);

        //4)Find the number in which the number of different digits is minimal. If there are several such numbers, find the first of them.
        findMinDifferentDigits(args);

        //5)Find the number of numbers containing only even digits, and among the remaining ones, the number of numbers with an equal number of even and odd digits.
        countEvenDigitNumbers(args);

        //6)Find a number in which the digits are in strict ascending order. If there are several such numbers, find the first of them.
        findStrictAscendingOrderNumber(args);

        //7)Find a number consisting only of different digits. If there are several such numbers, find the first of them.
        findNumberWithDifferentDigits(args);

    }

    // Task 1: Find the shortest and longest numbers. Output the numbers found and their length.
    private static void printNumbers(int[] array) {
        //output numbers
        System.out.println("//output numbers");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    private static void printNumbersLength(String[] args) {
        //output numbers length
        System.out.println("//output numbers length");
        for (String arg : args) {
            System.out.print(arg.length() + " ");
        }
        System.out.println();
    }

    private static void longestNumberByLength(String[] args) {
        //find the longest number
        System.out.println("//find the longest number");
        int longest = Integer.MIN_VALUE;
        for (String elem : args) {
            if (elem.length() > longest) {
                longest = elem.length();
            }
        }
        System.out.println(longest);

        /*//find the longest number
        System.out.println("//find the longest number");
        int longest = Integer.MIN_VALUE;
        for (int i = 0; i < args.length; i++) {
            String elem = args[i];
            if(elem.length() > longest){
                longest = args[i].length();
            }
        }
        System.out.println(longest);*/
    }

    private static void shortestNumberByLength(String[] args) {
        //find the shortest number
        System.out.println("//find the shortest number");
        int shortest = Integer.MAX_VALUE;
        for (String arg : args) {
            if (arg.length() < shortest) {
                shortest = arg.length();
            }
        }
        System.out.println(shortest);

        /*//find the shortest number
        System.out.println("//find the shortest number");
        int shortest = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if(args[i].length() < shortest){
                shortest = args[i].length();
            }
        }
        System.out.println(shortest);*/
    }


    // Task 2: Numbers in ascending (descending) order of their length values
    private static void printNumbersLengthAsc(String[] args) {
        System.out.println("//output numbers length in asc order:");
        int[] asc = new int[args.length];
        int count = 0;
        for (String arg : args) {
            asc[count] = arg.length();
            count++;
        }
        Arrays.sort(asc);
        System.out.println(Arrays.toString(asc));
    }

    private static void printNumbersLengthDesc(String[] args) {
        System.out.println("//output numbers length in desc order:");
        Integer[] desc = new Integer[args.length]; // Use Integer[] to use Collections for sorting
        int count = 0;
        for (String arg : args) {
            desc[count] = arg.length();
            count++;
        }
        Arrays.sort(desc, Collections.reverseOrder());
        System.out.println(Arrays.toString(desc));
    }


    // Task 3: Numbers whose length is less (greater) than the average length for all numbers, as well as the length
    private static void averageLengthNumbers(String[] args) {
        System.out.println("//output average length of numbers :");
        int[] res = new int[args.length];
        int count = 0;
        for (String arg : args) {
            res[count] = arg.length();
            count++;
        }
        int sum = 0;
        for (int i = 0; i < res.length; i++) {
            sum += res[i];
        }
        int avg = sum / res.length;
        System.out.println(avg);
    }

    private static void numbersValuesGreaterAvgLength(String[] args) {
        System.out.println("// Output values of numbers that have length greater than avg length of all numbers:");

        // Step 1: Calculate total length and average length
        int totalLength = 0;
        for (String arg : args) {
            totalLength += arg.length();
        }
        double avgLength = (double) totalLength / args.length;

        // Step 2: Collect numbers with length greater than average
        ArrayList<String> resultList = new ArrayList<>();
        for (String arg : args) {
            if (arg.length() > avgLength) {
                resultList.add(arg + " (length = " + arg.length() + ")");
            }
        }

        // Step 3: Convert to array for output
        String[] results = resultList.toArray(new String[0]);
        System.out.println(Arrays.toString(results));
    }

    private static void numbersValuesLessAvgLength(String[] args) {
//        //assume we have String[] args = {"10", "1", "23", "555", "1001", "0", "18"}
//        System.out.println("//output values of numbers that has length less then avg length of all numbers :");
//        System.out.println("Expected result is: [1 (length = 1), 0 (length = 1)]");
//        //find avg for all numbers:
//        int [] res = new int[args.length];
//        int count = 0;
//        for (String arg : args) {
//            res[count] = arg.length();
//            count++;
//        }
//        int sum = 0;
//        for (int item : res) {
//            sum += item;
//        }
//        int avg = sum / res.length;
//        int amountElements = 0;
//        for (int less : res) {
//            if(less > avg){
//                amountElements++;
//            }
//        }
//        String[] result = new String[amountElements];
//        int counting = 0;
//        for (int i = 0; i < args.length; i++) {
//            if(args[i].length() < avg){
//                result[counting] = args[i];
//                counting++;
//            }
//        }
//        String [] fullResult = new String[amountElements];
//        StringBuilder val;
//        StringBuilder[] sbArr = new StringBuilder[amountElements];
//        int countElem = 0;
//        for (int i = 0; i < result.length; i++) {
//            fullResult[i] = result[i];
//            val = new StringBuilder(fullResult[i] + "(length = " + result[i].length() + ")");
//            sbArr[countElem] = val;
//            countElem++;
//        }
//        System.out.println(Arrays.toString(sbArr));

        System.out.println("// Output values of numbers that have length less than avg length of all numbers:");

        // Step 1: Calculate total length and average length
        int totalLength = 0;
        for (String arg : args) {
            totalLength += arg.length();
        }
        double avgLength = (double) totalLength / args.length;

        // Step 2: Collect numbers with length less than average
        ArrayList<String> resultList = new ArrayList<>();
        for (String arg : args) {
            if (arg.length() < avgLength) {
                resultList.add(arg + " (length = " + arg.length() + ")");
            }
        }

        // Step 3: Convert to array for output
        String[] results = resultList.toArray(new String[0]);
        System.out.println(Arrays.toString(results));

    }

    private static void numbersValuesBothCases(String[] args) {
        System.out.println("// Output values of numbers whose lengths are less or greater than avg length of all numbers:");

        // Step 1: Calculate total length and average length
        int totalLength = 0;
        for (String arg : args) {
            totalLength += arg.length();
        }
        double avgLength = (double) totalLength / args.length;

        // Step 2: Collect numbers based on user-defined condition
        ArrayList<String> lessThanAvg = new ArrayList<>();
        ArrayList<String> greaterThanAvg = new ArrayList<>();

        for (String arg : args) {
            if (arg.length() < avgLength) {
                lessThanAvg.add(arg + " (length = " + arg.length() + ")");
            }
            if (arg.length() > avgLength) {
                greaterThanAvg.add(arg + " (length = " + arg.length() + ")");
            }
        }

        // Output results
        System.out.println("Numbers less than average length: " + Arrays.toString(lessThanAvg.toArray(new String[0])));
        System.out.println("Numbers greater than average length: " + Arrays.toString(greaterThanAvg.toArray(new String[0])));
    }


    // Task 4: Find the number with the minimum number of different digits
    private static void findMinDifferentDigits(String[] args) {
        String result = null;
        int minDifferentDigits = Integer.MAX_VALUE;

        for (String num : args) {
            int uniqueDigitsCount = (int) num.chars().distinct().count();
            if (uniqueDigitsCount < minDifferentDigits) {
                minDifferentDigits = uniqueDigitsCount;
                result = num;
            }
        }

        System.out.println("Number with minimal different digits: " + result);
    }


    // Task 5: Count numbers with only even digits and equal counts of even/odd digits
    private static void countEvenDigitNumbers(String[] args) {
        int countOnlyEvenDigits = 0;
        int countEqualEvenOddDigits = 0;

        for (String num : args) {
            int evenCount = 0;
            int oddCount = 0;

            for (char digit : num.toCharArray()) {
                if ((digit - '0') % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            if (evenCount == num.length()) {
                countOnlyEvenDigits++;
            }

            if (evenCount == oddCount) {
                countEqualEvenOddDigits++;
            }
        }

        System.out.println("Count of numbers with only even digits: " + countOnlyEvenDigits);
        System.out.println("Count of numbers with equal even and odd digits: " + countEqualEvenOddDigits);
    }


    // Task 6: Find a number with digits in strict ascending order
    private static void findStrictAscendingOrderNumber(String[] args) {
        String result = null;

        for (String num : args) {
            boolean isAscending = true;
            for (int i = 0; i < num.length() - 1; i++) {
                if (num.charAt(i) >= num.charAt(i + 1)) {
                    isAscending = false;
                    break;
                }
            }
            if (isAscending) {
                result = num;
                break;
            }
        }

        System.out.println("Number with digits in strict ascending order: " + result);
    }


    // Task 7: Find a number consisting only of different digits
    private static void findNumberWithDifferentDigits(String[] args) {
        String result = null;

        for (String num : args) {
            boolean hasDifferentDigits = true;
            boolean[] digitPresent = new boolean[10];

            for (char digit : num.toCharArray()) {
                int d = digit - '0';
                if (digitPresent[d]) {
                    hasDifferentDigits = false;
                    break;
                }
                digitPresent[d] = true;
            }

            if (hasDifferentDigits) {
                result = num;
                break;
            }
        }

        System.out.println("Number consisting only of different digits: " + result);
    }

}
