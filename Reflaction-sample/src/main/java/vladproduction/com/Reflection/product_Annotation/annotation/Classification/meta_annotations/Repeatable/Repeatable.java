package Reflection.product_Annotation.annotation.Classification.meta_annotations.Repeatable;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Repeatable {
}

/*когда необходимо повторно применить одну и ту же аннотацию к какому-то элементу
(объявлению класса, интерфейсу, полю или к используемому типу)*/
