package vladproduction.com.demo_generics_used;

public class Demo {
    public static void main(String[] arg) {
        DynamicArray<Integer> dynArray = new DynamicArray<>();
        dynArray.addElement(10);
        Integer first = dynArray.getElement(0);
        System.out.println(first);
        //dynArray.addElement("Java"); // compile error
        //String second = (String) dynArray.getElement(1);
        //System.out.println(second);

        //if objects of the parametrized class are compatible:

        DynamicArray<Double> daDouble = new DynamicArray<>();
        DynamicArray<Integer> daInteger = new DynamicArray<>();
//        daDouble = daInteger; // error - incompatible types
    }
}
class DynamicArray<T> {
    private T[] elements = (T[]) new Object[5];
    public void addElement(T element) {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = element;
        }
    }
    public T getElement(int index) {
        T element = null;
        for (int i = 0; i < elements.length; i++) {
            if(index == i){
                element = elements[i];
            }
        }
        return element;
    }
}
