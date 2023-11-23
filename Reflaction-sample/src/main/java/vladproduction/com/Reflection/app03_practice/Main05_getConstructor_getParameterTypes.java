package Reflection.app03_practice;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Main05_getConstructor_getParameterTypes {
    public static void main(String[] args) {
        MyClass myClass = null;
        try{
            Class cl = Class.forName("Reflection.app03_practice.MyClass");
            Constructor [] constructors = cl.getDeclaredConstructors();
            for (Constructor itemConstructor: constructors){
                Class [] parameterTypes = itemConstructor.getParameterTypes();
                System.out.println(Arrays.toString(parameterTypes));

                for (Class itemParameterType: parameterTypes){
                    System.out.println(itemParameterType.getName()+"");
                }
                System.out.println("----------");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
