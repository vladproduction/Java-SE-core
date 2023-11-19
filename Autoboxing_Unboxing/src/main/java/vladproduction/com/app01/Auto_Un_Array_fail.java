package vladproduction.com.app01;

public class Auto_Un_Array_fail {
    public static void main(String[] args) {
        Integer arr [] = {1,2,3,4,5};
        method2(arr); //error compilation!!!
    }

    private static void method2(int[] arr) {
        System.out.println("int[] arr");
    }
}
