package vladproduction.com.app01;

public class UnboxingExample {
    public static void main(String[] args) {

        //instantiating:
        Integer iOb = 7;
        Double dOb = 7.0;
        Character cOb = 'a';
        Boolean bOb = true;

        int i = iOb;
        double d = dOb;
        char c = cOb;
        boolean b = bOb;

        //in expressions:
        Integer int1 = 20;
        Integer int2 = 25;
        System.out.println("expression #1 = " + (int1 > int2));
        System.out.println("expression #2 = " + (int1 < int2));
        System.out.println("expression #1 = " + (int1 + int2));

        Integer iOb1 = 100;
        Integer iOb2 = 100;
        System.out.println(iOb1 == iOb2);

        int iOb3 = 200;
        Integer iOb4 = 200;
        System.out.println(iOb3 == iOb4);

        int iOb5 = 200;
        int iOb6 = 200;
        System.out.println(iOb5 == iOb6);

//        expression #1 = false
//        expression #2 = true
//        expression #1 = 45
//        true
//        true
//        true
        System.out.println("-----------------------------");
        String str1 = new String ("test");
        String str = "test";

        System.out.println(str == str1); //false - reference
        System.out.println(str.equals(str1)); //true - value from StringPool
        System.out.println("-----------------");
        //in method parameters:
        method(iOb1);

    }
    public static void method(int a){
        System.out.println("int = " + a);
    }
    public static void method(Integer a){
        System.out.println("Integer = " + a); //this method works!
    }
}
