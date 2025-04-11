package com.vladproduction.string_handling;

public class PerformanceConsiderations {
    public static void main(String[] args) {

        //each iteration creates new String object:
        timingNewStrings(); //Elapsed time timingNewStrings = 6136


        //StringBuilder is faster and should be used in situations where thread safety is not a concern (i.e., in single-threaded contexts);
        //each iteration update reference
        timingStringBuilder(); //Elapsed time timingStringBuilder = 2

        //StringBuffer is similar to StringBuilder but is synchronized, making it thread-safe.
        // This makes it slower than StringBuilder.
        // However, it is suitable for multi-threaded applications where string modifications may occur concurrently.
        timingStringBuffer(); //Elapsed time timingStringBuffer = 0


    }

    private static void timingNewStrings() {
        long startTime = System.currentTimeMillis();
        String str = "Hello";
        for (int i = 0; i < 10_000; i++) {
            str += " ";
            System.out.println(str);
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("\t\t\nElapsed time timingNewStrings = " + elapsedTime);
    }

    private static void timingStringBuilder() {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < 10_000; i++) {
            sb.append(" "); // Modifies the existing StringBuilder object
        }
        String result = sb.toString(); // Convert back to String if needed
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("\t\t\nElapsed time timingStringBuilder = " + elapsedTime);
    }

    private static void timingStringBuffer() {
        long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < 10_000; i++) {
            sbf.append(" "); // Thread-safe but slower
        }
        String result = sbf.toString(); // Convert back to String if needed
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("\t\t\nElapsed time timingStringBuffer = " + elapsedTime);
    }

}
