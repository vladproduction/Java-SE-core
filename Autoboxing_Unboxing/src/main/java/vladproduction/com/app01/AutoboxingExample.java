package vladproduction.com.app01;

public class AutoboxingExample {
    public static void main(String[] args) {
        Integer iOb = 7;
        Double dOb = 7.0;
        Character cOb = 'a';
        Boolean bOb = true;

        method(iOb);
        method(dOb);
        method(cOb);
        method(bOb);
    }

    public static void method(Object object) {
        if(object.getClass()==Integer.class){
            System.out.println("Integer.class, value = " + object);
        }
        if(object.getClass()==Double.class){
            System.out.println("Double.class, value = " + object);
        }
        if(object.getClass()==Character.class){
            System.out.println("Character.class, value = " + object);
        }
        if(object.getClass()==Boolean.class){
            System.out.println("Boolean.class, value = " + object);
        }
    }
}

