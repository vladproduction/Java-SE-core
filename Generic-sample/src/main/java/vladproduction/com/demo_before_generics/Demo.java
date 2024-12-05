package vladproduction.com.demo_before_generics;

public class Demo {
    public static void main(String[] arg) {
        DynamicArray dynArray = new DynamicArray();
        dynArray.addElement(Integer.valueOf(10));
        Integer first = (Integer) dynArray.getElement(0);
        System.out.println(first);
        dynArray.addElement("Java");
        String second = (String) dynArray.getElement(1);
        System.out.println(second);
    }
}
class DynamicArray {
    private Object[] elements = new Object[5];
    public void addElement(Object element) {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = element;
        }
    }
    public Object getElement(int index) {
        Object element = null;
        for (int i = 0; i < elements.length; i++) {
            if(index == i){
                element = elements[i];
            }
        }
        return element;
    }
}
