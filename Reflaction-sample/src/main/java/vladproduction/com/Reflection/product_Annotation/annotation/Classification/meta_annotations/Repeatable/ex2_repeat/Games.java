package Reflection.product_Annotation.annotation.Classification.meta_annotations.Repeatable.ex2_repeat;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Games {
    Game[] value();
}

