package vladproduction.com.app01;

public class ClassExtends extends ClassB{

    public ClassExtends(String fieldA, int fieldB) {
        super(fieldA, fieldB);
    }
    //cant override --> in classB such method is declared as 'final'
    @Override
    public void printMethod(String fieldA, int fieldB) {

        super.printMethod(fieldA, fieldB);
    }
}
