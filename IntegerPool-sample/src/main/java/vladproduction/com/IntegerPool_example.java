package vladproduction.com.app01;

public class IntegerPool_example {
    public static void main(String[] args) {
//        int a = 100;
//        int b = 100;
//        System.out.println(a==b); //true

//        Integer a = 100;
//        Integer b = 100;
//        System.out.println(a==b); //true

        Integer a1 = 1000;
        Integer b1 = 1000;
        System.out.println(a1==b1); //false - as two obj
        System.out.println(a1.equals(b1)); //true - as two obj but <int pool> refer to the same place

        System.out.println("----inside cash---------------");
        Integer a = 127;
        Integer b = 127;
        System.out.println(a==b); //true - cause <int pool> as well

        Integer a2 = 128;
        Integer b2 = 128;
        System.out.println(a2==b2); //false - cause as two obj of Integer
        // and Integer is a wrapper , it does not change any longer for variable value and as a type
        //it caused for all wrappers Double, Float, etc.
    }
}
