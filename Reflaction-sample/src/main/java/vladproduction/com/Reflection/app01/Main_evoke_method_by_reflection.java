package Reflection.app01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main_evoke_method_by_reflection {
    public static void main(String[] args) {
        try {
            Class cl = Class.forName("Reflection.app01.Player");
            Object objectP1 = cl.newInstance();
            Method[] methods = cl.getDeclaredMethods();
            for(Method item: methods){
                System.out.println(item);
            }
            Method doAction = cl.getDeclaredMethod("doAction");
            doAction.invoke(objectP1);
            System.out.println("---fields: ------------");
            Field [] fields = cl.getDeclaredFields();
            for (Field item: fields){
                System.out.println(item);
            }
            Field numberField = cl.getDeclaredField("number");
            numberField.set(objectP1,10);
            Integer currentValue = numberField.getInt(objectP1); //current value of field
            System.out.println("currentValue: "+currentValue);

            Field nameField = cl.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(objectP1,"Zina");
            String currentValueName = nameField.get(objectP1)+""; //current value of field
            System.out.println("currentValueName: "+currentValueName);
//            Player p1 = (Player) object;
//            p1.doAction();
            //p1.number(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
