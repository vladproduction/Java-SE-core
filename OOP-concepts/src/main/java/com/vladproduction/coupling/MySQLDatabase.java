package com.vladproduction.coupling;

//Concrete implementations
public class MySQLDatabase {

    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }

    public String query(String sql) {
        System.out.println("Executing query: " + sql);
        return "Order details: Item #12345, $99.99";
    }

    public void update(String sql) {
        System.out.println("Executing update: " + sql);
    }

    public void disconnect() {
        System.out.println("Disconnecting from MySQL database...");
    }

}
