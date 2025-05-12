package com.vladproduction.app10.service_repository_pattern.domain;

/**
 * MongoDB-specific implementation of a User.
 * In a real system, this might contain MongoDB-specific attributes or behaviors.
 */
public class MongoDBUser extends User{

    private String mongoDBId;

    public MongoDBUser(String username, int age) {
        super(username, age);
        this.mongoDBId = generateMongoId();
    }

    public MongoDBUser(String username, int age, String mongoDBId) {
        super(username, age);
        this.mongoDBId = mongoDBId;
    }

    public String getMongoDBId() {
        return mongoDBId;
    }

    public void setMongoDBId(String mongoDBId) {
        this.mongoDBId = mongoDBId;
    }

    private String generateMongoId() {
        // Simulate MongoDB's ObjectId generation (simplified)
        return "mongo_" + System.currentTimeMillis();
    }

    @Override
    public String getDataSourceInfo() {
        return "MongoDB (ID: " + mongoDBId + ")";
    }
}
