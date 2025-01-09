package com.vladproduction;

import java.util.logging.*;

public class LoggerPerformerAppFormatter {

    private static final Logger logger = Logger.getLogger("com.vladproduction.simple01");

    public static class CustomLogFormatter extends SimpleFormatter {
        @Override
        public String format(LogRecord record) {
            return String.format("[%s]: %s%n",
                    record.getLevel(),
                    record.getMessage());
        }
    }

    public static void main(String[] args) {
        // Set up the console handler with the custom formatter
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new CustomLogFormatter());
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.ALL); // Set logging level to ALL to capture all log messages

        // Log messages using the logger
        logger.fine("Starting LoggerPerformerAppFormatter");

        PersonRecord johnRecord = new PersonRecord("John", 30);
        logger.info("Created person: " + johnRecord.fullDescription());
        logger.fine("John's adult status: " + johnRecord.isAdult());

        PersonRecord janeRecord = new PersonRecord("Jane", 17);
        logger.info("Created person: " + janeRecord.fullDescription());
        logger.fine("Jane's adult status: " + janeRecord.isAdult());

        logger.fine("Comparison between John and Jane: " + PersonRecord.compareAges(johnRecord, janeRecord));

        logger.fine("Exiting LoggerPerformerAppFormatter");
    }

}
