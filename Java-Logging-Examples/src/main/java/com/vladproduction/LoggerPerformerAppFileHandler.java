package com.vladproduction;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerPerformerAppFileHandler {
    private static final Logger logger = Logger.getLogger("com.vladproduction.simple01");

    public static void main(String[] args) {
        try {
            // Set up the file handler
            FileHandler fileHandler = new FileHandler("application.log", false); // (append mode 'true': next logs adding to the file, but not override)
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL); // Set logging level to ALL

            // Log messages using the logger
            logger.info("Starting LoggerPerformerAppFileHandler");

            PersonRecord johnRecord = new PersonRecord("John", 30);
            logger.info("Created person: " + johnRecord.fullDescription());
            logger.info("John's adult status: " + johnRecord.isAdult());

            PersonRecord janeRecord = new PersonRecord("Jane", 17);
            logger.info("Created person: " + janeRecord.fullDescription());
            logger.info("Jane's adult status: " + janeRecord.isAdult());

            logger.info("Comparison between John and Jane: " + PersonRecord.compareAges(johnRecord, janeRecord));

            logger.info("Exiting LoggerPerformerAppFileHandler");
        } catch (IOException e) {
            logger.severe("Failed to set up file logger: " + e.getMessage());
        }
    }

}
