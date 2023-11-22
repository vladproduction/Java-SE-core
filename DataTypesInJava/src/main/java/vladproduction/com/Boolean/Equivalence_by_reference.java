package Boolean;

public class Equivalence_by_reference {
    public static void main(String[] args) {
        Integer n1 = new Integer(49);
        Integer n2 = new Integer(49);
        System.out.println(n1==n2);  //not same reference so it`s false
        System.out.println(n1!=n2);  //true
    }
}
