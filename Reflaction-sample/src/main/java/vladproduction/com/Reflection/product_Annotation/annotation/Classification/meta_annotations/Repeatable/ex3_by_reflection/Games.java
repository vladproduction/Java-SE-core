package Reflection.product_Annotation.annotation.Classification.meta_annotations.Repeatable.ex3_by_reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Games {
    Game[] value();
}

