package com.vladproduction.app10.service_repository_pattern;

import com.vladproduction.app10.service_repository_pattern.domain.MongoDBUser;
import com.vladproduction.app10.service_repository_pattern.domain.MySqlUser;
import com.vladproduction.app10.service_repository_pattern.repository.MongoDBRepository;
import com.vladproduction.app10.service_repository_pattern.repository.MySqlRepository;
import com.vladproduction.app10.service_repository_pattern.service.UserService;

import java.util.List;

/**
 * Main application demonstrating the usage of our user data system.
 * Shows dependency injection, polymorphism, and service-repository pattern.
 */
public class MainApp {
    public static void main(String[] args) {

        System.out.println("===== User Data System Demonstration =====");

        // Demonstrate MongoDB implementation
        demoMongoDBUsers();

        System.out.println("\n----------------------------------------\n");

        // Demonstrate MySQL implementation
        demoMySqlUsers();

    }

    private static void demoMongoDBUsers() {
        System.out.println("MongoDB User System:");

        // Create repository
        MongoDBRepository mongoRepo = new MongoDBRepository();

        // Inject repository into service (dependency injection)
        UserService<MongoDBUser, String> mongoUserService = new UserService<>(mongoRepo);

        // Create some users
        MongoDBUser user1 = new MongoDBUser("john_mongo", 25);
        MongoDBUser user2 = new MongoDBUser("alice_mongo", 17);
        MongoDBUser user3 = new MongoDBUser("bob_mongo", 30);

        // Register users
        mongoUserService.registerUser(user1);
        mongoUserService.registerUser(user2);
        mongoUserService.registerUser(user3);

        // Display all users
        System.out.println("\nAll MongoDB Users:");
        List<MongoDBUser> allMongoUsers = mongoUserService.getAllUsers();
        allMongoUsers.forEach(System.out::println);

        // Filter users by age
        System.out.println("\nAdult MongoDB Users (18+):");
        List<MongoDBUser> adultMongoUsers = mongoUserService.getUsersByMinimumAge(18);
        adultMongoUsers.forEach(System.out::println);

        // Use MongoDB-specific features
        System.out.println("\nUsing MongoDB-specific query:");
        List<MongoDBUser> queryResults = mongoRepo.findByMongoQuery("{ age: { $gte: 18 } }");
        queryResults.forEach(System.out::println);
    }

    private static void demoMySqlUsers() {
        System.out.println("MySQL User System:");

        // Create repository
        MySqlRepository mySqlRepo = new MySqlRepository();

        // Inject repository into service (dependency injection)
        UserService<MySqlUser, Long> mySqlUserService = new UserService<>(mySqlRepo);

        // Create some users
        MySqlUser user1 = new MySqlUser("john_mysql", 25);
        MySqlUser user2 = new MySqlUser("alice_mysql", 17);
        MySqlUser user3 = new MySqlUser("bob_mysql", 30);

        // Register users
        mySqlUserService.registerUser(user1);
        mySqlUserService.registerUser(user2);
        mySqlUserService.registerUser(user3);

        // Display all users
        System.out.println("\nAll MySQL Users:");
        List<MySqlUser> allMySqlUsers = mySqlUserService.getAllUsers();
        allMySqlUsers.forEach(System.out::println);

        // Filter users by age
        System.out.println("\nAdult MySQL Users (18+):");
        List<MySqlUser> adultMySqlUsers = mySqlUserService.getUsersByMinimumAge(18);
        adultMySqlUsers.forEach(System.out::println);

        // Use MySQL-specific features
        System.out.println("\nUsing MySQL-specific query:");
        List<MySqlUser> queryResults = mySqlRepo.executeRawSql("SELECT * FROM users WHERE age >= 18");
        queryResults.forEach(System.out::println);
    }

}
