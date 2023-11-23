package vladproduction.com;

public class Main {

//need to work with this
//https://www.baeldung.com/java-varargs

    public static void main(String[] args) {
        m();
        m(new int[0]);
        m(1);
        m(2, 3);
        int[] r = {1, 2, 3, 4, 5};
        m(r);
    }

    public static void m1() {

    }

    public static void m1(int x) {

    }

    public static void m2(int x, int y) {

    }

    //    public static void m(String param, int... t){
//
//    }
//    public static void m(){
//
//    }
    public static void m(int...w) {
        int n = w.length;
        System.out.println(n);
    }
}
