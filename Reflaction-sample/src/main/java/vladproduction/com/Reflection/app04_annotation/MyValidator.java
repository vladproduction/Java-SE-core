package Reflection.app04_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyValidator {
    //public abstract String errorMessage();
    String errorMessage()default "not valid data";
    String errorMessage2()default "not valid data2";
}
