package vladproduction.com.String_concatenation;

public class Concatenation {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String sString = "x, y, z ";
        System.out.println(sString + x + y + z);

        System.out.println(x + sString);

        /*x, y, z 012
        0x, y, z*/


    }
}
