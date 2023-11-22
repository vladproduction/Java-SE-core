package vladproduction.com;

import java.util.Arrays;

public class OutOfBounds {
    public static void main(String[] args) {
        try {
            int data[] = {0, 1, 2, 3, 4};
            //int data [] = {0,1,2,3,4,5,6,7,8,9,10};
            System.out.println(Arrays.toString(data));
            int value = data[10];
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("finally block{}");
        }

    }
}



