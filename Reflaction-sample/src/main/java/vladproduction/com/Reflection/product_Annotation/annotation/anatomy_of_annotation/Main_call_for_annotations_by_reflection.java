package Reflection.product_Annotation.annotation.anatomy_of_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class Main_call_for_annotations_by_reflection {
    public static void main(String[] args) throws NoSuchMethodException {

        Class<DemoClass> demoClassObjects = DemoClass.class;
        readAnnotationOn(demoClassObjects);
        Method method = demoClassObjects.getMethod("printString");
        readAnnotationOn(method);

    }

    static void readAnnotationOn(AnnotatedElement element) {
        try {
            System.out.println("\nSearching for annotations in: " + element.getClass().getName());
            Annotation[] annotations = element.getAnnotations();
            for (Annotation items : annotations) {
                if (items instanceof JavaFileInfo ) {
                    JavaFileInfo fileInfo = (JavaFileInfo) items;
                    System.out.println("Author: " + fileInfo.name());
                    System.out.println("Version: " + fileInfo.value());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
