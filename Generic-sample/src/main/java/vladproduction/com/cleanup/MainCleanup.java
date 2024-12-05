package vladproduction.com.cleanup;

/**
 * Below is an example of a code cleanup mechanism on a static generic method count() that counts the number of elements
 * in an array that are equal to value. The type parameter has no bounds, so when cleaning up the method code,
 * the Object class will be substituted wherever a parameter of type T is specified.
 * */
public class MainCleanup {
    public static void main(String[] args) {
    }
    private static int countObjects(Object[] array, Object value) {
        int num = 0;
        for (Object element: array) {
            if (element.equals(value)) {
                num++;
            }
        }
        return num;
    }
    private static <T> int countTypes(T[] array, T value) {
        int num = 0;
        for (T element: array) {
            if (element.equals(value)) {
                num++;
            }
        }
        return num;
    }
}
