package com.vladproduction.srp.employee_architecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    private Connection connection;
    private static DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();

    private DatabaseConnectionManager(){

    }
    public void connection() throws SQLException {
        connection = DriverManager.getConnection("Database Url");
        System.out.println("Connection to DB established");
    }

    public Connection getConnection(){
        return connection;
    }

    public void disconnect() throws SQLException {
        connection.close();
        System.out.println("Connection to DB closed");
    }
}
