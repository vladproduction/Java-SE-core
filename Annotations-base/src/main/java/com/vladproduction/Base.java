package com.vladproduction;

/**
 * An example in which the @BaseAction annotation accompanies a class declaration.
 * This annotation identifies the Base class. The annotation name is followed by a parenthesized list of
 * initialization values for member methods. To pass a value to a member method, a value is assigned to the
 * member method name. Thus, in the example above, the string "SELECT name, phone FROM phonebook" is assigned
 * to the sqlRequest() method, a member of the BaseAction annotation type. However, there are no parentheses
 * after the sqlRequest name in the assignment operation. When a member method is passed an initialization value,
 * only the method name is used. Therefore, in this context, member methods look like fields.
 * */

@BaseAction(level = 2, sqlRequest = "SELECT name, phone FROM phonebook")
public class Base {
    public void doAction() {
        Class clazz = Base.class;
        BaseAction action = (BaseAction) clazz.getAnnotation( BaseAction.class);
        System.out.println(action.level());
        System.out.println(action.sqlRequest());
    }
}