package vladproduction.com.if_else_;

public class IfElse {

    static int test(int testval, int target) {
        int result = 0;
        if(testval > target)
            result = +1;
        else if(testval < target)
            result = -1;
        else
            result = 0; // Совпадает
        return result;
    }

    //variant 2:
    static int test2(int testval, int target) {
        int result = 0;
        if(testval > target)
            return +1;
        else if(testval < target)
            return -1;
        else
            return 0; // Совпадает
    }
    public static void main(String[] args) {
        System.out.println(test(10, 5));
        System.out.println(test(5, 10));
        System.out.println(test(5, 5));

        System.out.println(test2(10, 5));
        System.out.println(test2(5, 10));
        System.out.println(test2(5, 5));
    }
}
