package Reflection.app03_practice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main04_getConstructor {
    public static void main(String[] args) {
        MyClass myClass = null;
        try{
            Class cl = Class.forName("Reflection.app03_practice.MyClass");
            Class [] params = {int.class, String.class};
            myClass = (MyClass) cl.getConstructor(params).newInstance(100,"new name AAA");
            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(myClass);
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        System.out.println(myClass);
    }
}
