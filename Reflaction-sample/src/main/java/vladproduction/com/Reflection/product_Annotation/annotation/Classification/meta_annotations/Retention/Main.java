package Reflection.product_Annotation.annotation.Classification.meta_annotations.Retention;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        AnnotatedClass anAnnotatedClass = new AnnotatedClass();
        Annotation[] annotations = anAnnotatedClass.getClass().getAnnotations();

        System.out.println("(RunTime): "+annotations.length);
        System.out.println("1: "+annotations [0]);
        System.out.println("2: "+annotations [1]);
    }
}

/*В этом примере мы создали свою собственную аннотацию RetentionAnnotation, а также использовали
аннотацию @Deprecated, которая также имеет политику RetentionPolicy.RUNTIME.
Если мы исправим политику аннотации RetentionAnnotation с RetentionPolicy.RUNTIME на
RetentionPolicy.SOURCE (и закомментируем строку в классе Main, выводящую второй элемент массива),
то программа отобразит только одну аннотацию deprecated, поскольку аннотация с RetentionPolicy.SOURCE
во время компиляции будет удалена.*/
