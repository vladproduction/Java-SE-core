package vladproduction.com.generics_methods;

public class GenericMethod {
    public static void main(String[] args) {
        System.out.println(GenericMethod.asByte(Integer.valueOf(7)));
        System.out.println(GenericMethod.asByte(Float.valueOf(7.0F)));
        System.out.println(GenericMethod.asByte(Character.valueOf('7')));
        /*  7
            7
            0  */
    }

    public static <T> byte asByte(T num) {
        if (num instanceof Number) {
            return ((Number) num).byteValue();
        }
        return 0;
    }
}
