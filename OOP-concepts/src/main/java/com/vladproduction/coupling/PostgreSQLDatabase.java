package com.vladproduction.coupling;

// Implementation of Database interface
public class PostgreSQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }

    @Override
    public String query(String sql) {
        System.out.println("PostgreSQL executing query: " + sql);
        return "Order details: Item #12345, $99.99";
    }

    @Override
    public void update(String sql) {
        System.out.println("PostgreSQL executing update: " + sql);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from PostgreSQL database...");
    }
}