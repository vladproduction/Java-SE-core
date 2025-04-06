package com.vladproduction.coupling;

// LOOSE COUPLING EXAMPLE
// Using interfaces and dependency injection

// Database interface
public interface Database {

    void connect();
    String query(String sql);
    void update(String sql);
    void disconnect();

}
