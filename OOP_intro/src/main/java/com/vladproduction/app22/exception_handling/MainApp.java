package com.vladproduction.app22.exception_handling;

import com.vladproduction.app22.exception_handling.custom.DatabaseConnectionException;
import com.vladproduction.app22.exception_handling.custom.InsufficientResourceException;
import com.vladproduction.app22.exception_handling.custom.InvalidInputException;
import com.vladproduction.app22.exception_handling.handler.GlobalExceptionHandler;
import com.vladproduction.app22.exception_handling.service.DataProcessingService;
import com.vladproduction.app22.exception_handling.service.DatabaseService;
import com.vladproduction.app22.exception_handling.service.ResourceManagementService;

import java.sql.Connection;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class MainApp {

    private static final Logger LOGGER = Logger.getLogger(MainApp.class.getName());

    public static void main(String[] args) {

        // Register global exception handler
        GlobalExceptionHandler.registerGlobalHandler();

        // Demonstrate various exception handling scenarios
        //run all together or one-by-one to see the different exceptions in action
        demonstrateResourceManagement();
        demonstrateDataProcessing();
        demonstrateDataBaseConnection();



    }

    private static void demonstrateResourceManagement() {
        ResourceManagementService resourceManagementService = new ResourceManagementService();
        try{
            //success resource allocation
            resourceManagementService.allocateResources(50);

            //try to allocate more resources than available
            resourceManagementService.allocateResources(60);
        }catch (InsufficientResourceException | InvalidInputException e){
            LOGGER.severe("Resource management error: " + e.getMessage());
        }
    }

    private static void demonstrateDataProcessing() {
        DataProcessingService dataProcessingService = new DataProcessingService();
        List<String> inputData = Arrays.asList("Hello", "", "World!", null, "Java");
        try{
            List<String> processedData = dataProcessingService.processData(inputData);
            LOGGER.info("Processed data: " + processedData);
        } catch (InvalidInputException e) {
            LOGGER.severe("Data processing error: " + e.getMessage());
        }
    }

    private static void demonstrateDataBaseConnection() {
        DatabaseService databaseService = new DatabaseService();
        Connection connection = null;

        try{
            connection = databaseService.getConnection();
            //perform DB operations using the connection
        } catch (DatabaseConnectionException e) {
            LOGGER.severe("Database connection error: " + e.getMessage());
        } finally {
            //ensure the connection is closed even if an exception is thrown
            databaseService.closeConnection(connection);
        }

    }
}














