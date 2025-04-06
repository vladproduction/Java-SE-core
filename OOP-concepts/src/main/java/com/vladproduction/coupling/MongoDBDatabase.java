package com.vladproduction.coupling;

// Another implementation of Database interface
public class MongoDBDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB database...");
    }

    @Override
    public String query(String sql) {
        System.out.println("MongoDB executing query (adapted): " + sql);
        return "Order details: Item #12345, $99.99";
    }

    @Override
    public void update(String sql) {
        System.out.println("MongoDB executing update (adapted): " + sql);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MongoDB database...");
    }
}
