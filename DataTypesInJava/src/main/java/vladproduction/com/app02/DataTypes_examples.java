package vladproduction.com.app02;

public class DataTypes_examples {
    public static void main(String[] args) {
        /*1) byte, short, int и long
          2) flоаt и double
          3) char
          4) boolean*/

        System.out.println("------------1)-------------------");
        int x = 0;
        long i = 0, j, k;
        byte a1 = (byte) 0xF1, a2 = 0x07;
        short r1 = 017;

        System.out.println("x = " + x);
        System.out.println("i = " + i);
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("r1 = " + r1);

        System.out.println("------------2)-------------------");
        float x1 = 3.5f, x2 = 3.7E6f, x3 = -1.8E-7f;
        double z = 1.0;
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("x3 = " + x3);
        System.out.println("z = " + z);

        System.out.println("------------3)-------------------");
        char symbol = 'f';
        System.out.println("symbol = " + symbol);
        char B = '\u0042';
        System.out.println("b = " + B);
        char backspace = '\u0008'; //\b
        System.out.println("aaa" + backspace);
        char horizTabulation = '\u0009'; //\t
        System.out.println("a"+horizTabulation+"b"+"c"+horizTabulation+"d");
        char newStringLine = '\n'; //\n
        System.out.println("a, b, c, d;" + newStringLine + "1, 2, 3, 4;");
        char formFeed = '\u000C'; // \f
        System.out.println("formFeed = " + formFeed); // ???
        char carriageReturn = '\r';
        System.out.println("a, b, c;" + carriageReturn); //???
        char doubleMark = '\u0022';
        String a = "symbol marked by double quote";
        System.out.println("a = " + a);
        System.out.println(doubleMark + a + doubleMark);
        char singleQuote = '\'';
        String b = "symbol marked by single quote";
        System.out.println("b = " + b);
        System.out.println(singleQuote + a + singleQuote);
        char backSlash = '\\';
        System.out.println("a"+backSlash);

        System.out.println("------------4)-------------------");
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);




    }
}
