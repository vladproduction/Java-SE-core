package vladproduction.com.variable_scope;

public class LocalVariableExample {
    public static void main(String[] args) {
        int valueInt = 100;
        {
            double valueDouble = 9.99;
            System.out.println("valueInt = " + valueInt);
            System.out.println("valueDouble = " + valueDouble);
        }
    }
}
