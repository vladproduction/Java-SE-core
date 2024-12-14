package com.vladproduction.flow_control.switch_case;

public class MainApp {
    public static void main(String[] args) {

        String guest = "guest";
        String user = "user";
        String admin = "admin";
        String owner = "owner";
        String noAuth = "null";
        String noAuthNullPointer = null;

        int accessLevel0 = accessLevel(guest);
        System.out.println("accessLevel0 = " + accessLevel0);

//        int accessLevelNoAuth = accessLevel(noAuth);
//        System.out.println("accessLevelNoAuth = " + accessLevelNoAuth);

//        int accessLevelNullPointer = accessLevel(noAuthNullPointer);
//        System.out.println("accessLevelNullPointer = " + accessLevelNullPointer);

        int accessLevelOwner = accessLevel(owner);
        System.out.println("accessLevelOwner = " + accessLevelOwner);

        //version # 2 (lambda)
        int accessLevelUser = accessLevel2(user);
        System.out.println("accessLevelUser = " + accessLevelUser);

        //version # 3 (lambda and return)
        int accessLevelAdmin = accessLevel3(admin);
        System.out.println("accessLevelAdmin = " + accessLevelAdmin);
    }

    private static int accessLevel(String role){
        int level;
        switch (role){
            case "guest": level = 0;
            break;
            case "user" : level = 1;
            break;
            case "admin" : level = 2;
            break;
            case "owner" : level = 3;
            break;
            default: throw new IllegalArgumentException("non-authentic role.");
        }
        return level;
    }

    //same example with lambda expression
    private static int accessLevel2(String role){
        int level = switch (role) {
            case "guest" -> 0;
            case "user" -> 1;
            case "admin" -> 2;
            case "owner" -> 3;
            default -> throw new IllegalArgumentException("non-authentic role.");
        };
        return level;
    }

    //same example with lambda expression and inline returning
    private static int accessLevel3(String role){
        return switch (role) {
            case "guest" -> 0;
            case "user" -> 1;
            case "admin" -> 2;
            case "owner" -> 3;
            default -> throw new IllegalArgumentException("non-authentic role.");
        };
    }

}
