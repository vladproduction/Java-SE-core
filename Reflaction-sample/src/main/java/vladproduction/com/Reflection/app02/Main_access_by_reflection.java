package Reflection.app02;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main_access_by_reflection {
    public static void main(String[] args) {

        try {
            Class cl = Class.forName("Reflection.app02.Phone");
            Object phone = cl.newInstance();
            Method [] methodsDeclared = cl.getDeclaredMethods();
            for(Method item: methodsDeclared){
                System.out.println("methodsDeclared:");
                System.out.println(item);
            }
            Method infoMethod = cl.getDeclaredMethod("info");
            infoMethod.invoke(phone);
            Method priceDiscountMethod = cl.getDeclaredMethod("priceDiscount",int.class);
            //priceDiscountMethod.setAccessible(true);


            Field [] fieldsDeclared = cl.getDeclaredFields();
            for(Field fieldsItem: fieldsDeclared){
                System.out.println("fieldsDeclared:");
                System.out.println(fieldsItem);
            }
            Field modelField = cl.getDeclaredField("model");
            modelField.set(phone,"LG");
            String modelPhone = modelField.get(phone)+"";
            System.out.println("modelPhone = "+modelPhone);
            Field priceField = cl.getDeclaredField("price");
            priceField.setAccessible(true);
            priceField.set(phone,3000);
            Integer pricePhone = priceField.getInt(phone);
            System.out.println("pricePhone = "+pricePhone);

            System.out.println("priceDiscount:");
            Object result = priceDiscountMethod.invoke(phone,4000);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

