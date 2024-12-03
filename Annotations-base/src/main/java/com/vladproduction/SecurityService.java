package com.vladproduction;

import java.lang.reflect.Method;
import java.util.Arrays;
/**
 * The example creates a SecurityService class that determines the application's actions
 * depending on the SecurityLevelType value passed to the annotated method.
 * */
public class SecurityService {
    public void onInvoke(SecurityLevelType level, Method method, Object[] args){
        System.out.printf("%s() been invoked with parameters: %s ",
            method.getName(), Arrays.toString(args));
        switch (level) {
            case LOW -> System.out.println("security:" + level);
            case MEDIUM -> System.out.println("security:" + level);
            case HIGH -> System.out.println("security:" + level);
            default -> throw new EnumConstantNotPresentException(
                SecurityLevelType.class, level.toString());
        }
    }
}