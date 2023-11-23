package Reflection.app04_annotation;

import java.lang.reflect.Field;

public class ValidatorEngine {
    public void validate(Object obj){
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field: fields){
            if (field.isAnnotationPresent(MyValidator.class)){
                MyValidator myValidator = field.getDeclaredAnnotation(MyValidator.class);
                try {
                    field.setAccessible(true);
                    Integer value = field.getInt(obj);
                    if(value<=0){
                        String errorMessage = myValidator.errorMessage();
                        throw new RuntimeException(errorMessage);
                        //throw new RuntimeException("price is not valid");
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
