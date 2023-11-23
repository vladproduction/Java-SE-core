package vladproduction.com.Integer_operations;

public class MaxValue {
    public static void main(String[] args) {
//        Suppose that a variable a is declared as int a = 2147483647 (or equivalently, Integer.MAX_VALUE).
//        What does each of the following print? Explain each outcome.
//        a. System.out.println(a);    b. System.out.println(a+1);
//        c. System.out.println(2-a);  d. System.out.println(-2-a);
//        e. System.out.println(2*a);  f. System.out.println(4*a);

        int a = 2147483647;
        int MAX_VALUE = a;
        System.out.println("a="+a);
        System.out.println("b="+(a+1));
        System.out.println("c="+(2-a));
        System.out.println("d="+(-2-a));
        System.out.println("e="+(2*a));
        System.out.println("f="+(4*a));
    }
}
