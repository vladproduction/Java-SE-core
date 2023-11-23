package Reflection.product_Annotation.annotation.Classification.meta_annotations.Documented;

public class Tester {

    @TestDocumented(doTestDocument = "Document with annotation")
    public void doSomeTestDocument(){
        System.out.println("Test for annotation with create Document");
    }

    @TestNotDocumented(doTestNoDocument = "Document without annotation")
    public void doSomeTestNoDocument(){
        System.out.println("Test for annotation with no create Document");
    }
}

/*если запустить команду javadoc (или использовать IntellijIdea: Tools -> Generate JavaDoc…) и
просмотреть сгенерированный файл Tester.html, то увидите следующее: Screenshot1

Как видно на скриншоте, для метода doSomeTestNotDocumented() отсутствует информация о типе аннотации,
но эта информация предоставляется для метода doSomeTestDocumented(). Причина этому @Documented,
прикрепленная к аннотации @TestDocumented. @TestNotDocumented не использует эту аннотацию.*/
