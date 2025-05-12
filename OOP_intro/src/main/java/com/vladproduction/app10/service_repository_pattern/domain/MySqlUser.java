package com.vladproduction.app10.service_repository_pattern.domain;

/**
 * MySQL-specific implementation of a User.
 * In a real system, this might contain MySQL-specific attributes or behaviors.
 */
public class MySqlUser extends User {

    private long sqlId;

    public MySqlUser(String username, int age) {
        super(username, age);
        this.sqlId = System.currentTimeMillis();
    }

    public MySqlUser(String username, int age, long sqlId) {
        super(username, age);
        this.sqlId = sqlId;
    }

    public long getSqlId() {
        return sqlId;
    }

    public void setSqlId(long sqlId) {
        this.sqlId = sqlId;
    }

    @Override
    public String getDataSourceInfo() {
        return "MySQL (ID: " + sqlId + ")";
    }

}
