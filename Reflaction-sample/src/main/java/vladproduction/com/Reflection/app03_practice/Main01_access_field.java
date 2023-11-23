package Reflection.app03_practice;

import java.lang.reflect.Field;

public class Main01_access_field {
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
    }
}
