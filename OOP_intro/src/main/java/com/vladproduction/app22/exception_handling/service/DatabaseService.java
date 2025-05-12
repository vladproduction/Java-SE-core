package com.vladproduction.app22.exception_handling.service;

import com.vladproduction.app22.exception_handling.custom.DatabaseConnectionException;
import com.vladproduction.app22.exception_handling.util.ExceptionUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DatabaseService {

    private static final Logger LOGGER = Logger.getLogger(DatabaseService.class.getName());

    private static final String DB_URL = "jdbc:mysql://localhost:3306/oopdatabase";
    private static final String USER = "root";
    private static final String PASS = "11111111";//success
    //private static final String PASS = "11111112";//SEVERE: Database connection error: Failed to establish database connection


    //method to connect to database with exception handling
    public Connection getConnection() throws DatabaseConnectionException {

        try{
            //simulate potential connection issues:
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            LOGGER.info(() -> "Connected to database successfully");
            return connection;

        }catch (SQLException e){
            //transform SqlException to custom exception
            DatabaseConnectionException dbException = new DatabaseConnectionException(
                    "Failed to establish database connection",
                    DB_URL,
                    e.getErrorCode()
            );

            // Log the original exception details
            LOGGER.severe(()->String.format("SQL Error: %s", e.getMessage()));
            ExceptionUtils.logException(e);

            throw dbException;
        }

    }

    //method to close connection
    public void closeConnection(Connection connection){
        if(connection != null){
            try{
                connection.close();
                LOGGER.info("Database connection closed successfully");
            }catch (SQLException e){
                LOGGER.warning(() -> "Error closing database connection: " + e.getMessage());
                ExceptionUtils.logException(e);
            }
        }
    }


}
