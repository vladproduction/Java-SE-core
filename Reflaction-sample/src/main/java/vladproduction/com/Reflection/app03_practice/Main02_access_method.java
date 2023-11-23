package Reflection.app03_practice;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main02_access_method {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        int number = myClass.getNumber();
        String name = null;

        System.out.println("before reflection: "+"number: "+number+";"+"name: "+name);
        try{
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            name = (String) field.get(myClass);
        } catch (NoSuchFieldException | IllegalAccessException e){
            e.printStackTrace();
        }
        System.out.println("after reflection: "+"number: "+number+";"+"name: "+name);

        System.out.println("access to the method private static void printData():");
        printDataMy(myClass);

    }

    public static void printDataMy(Object myClass){
        try{
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(myClass,"new value");

            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(myClass);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
