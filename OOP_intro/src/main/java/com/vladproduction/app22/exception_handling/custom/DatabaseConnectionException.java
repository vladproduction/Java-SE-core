package com.vladproduction.app22.exception_handling.custom;

public class DatabaseConnectionException extends Exception{

    private String connectionUrl;
    private int errorCode;

    public DatabaseConnectionException(String message, String connectionUrl, int errorCode) {
        super(message);
        this.connectionUrl = connectionUrl;
        this.errorCode = errorCode;
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String toString() {
        return String.format("%s. Connection URL: %s; Error code: %d", getMessage(), connectionUrl, errorCode);
    }

}
