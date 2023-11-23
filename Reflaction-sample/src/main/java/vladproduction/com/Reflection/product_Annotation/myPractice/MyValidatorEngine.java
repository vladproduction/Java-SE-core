package Reflection.product_Annotation.myPractice;

import java.lang.reflect.Field;

public class MyValidatorEngine {

    public void validate(Object object){

        Field[] fields = object.getClass().getDeclaredFields();

            for (Field field: fields){
                if (field.isAnnotationPresent(MyValidator.class)){
                    MyValidator myValidator = field.getDeclaredAnnotation(MyValidator.class);
                    try{
                        field.setAccessible(true);
                        Integer value = field.getInt(object);
                        if (value<0){
                            throw new RuntimeException(myValidator.errorMessage());
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
        }
    }

}
