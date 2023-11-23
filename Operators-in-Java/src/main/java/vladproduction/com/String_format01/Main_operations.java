package vladproduction.com.String_format01;

public class Main_operations {
    public static void main(String[] args) {
        Methods add1 = new Methods(); //(int+int)
        add1.add1(2, 3);

        Methods add2 = new Methods(); //(String+String)
        add2.add2("Real ", " Madrid");

        Methods add3 = new Methods(); //(int+String)-->result in int
        add3.add3(1, "999");

        Methods add4 = new Methods(); //(int+String)-->result in String
        add4.add4(1878, " Manchester United");

        Methods minus1 = new Methods(); //(int-int)
        minus1.minus1(100, 1);

        Methods minus2 = new Methods(); //(String-String)--->result in int
        minus2.minus2("10", "9");

        Methods minus3 = new Methods(); //(int-int)--->rez in String
        minus3.minus3(10, 8);

        Methods minus4 = new Methods(); //(String-String)--->result in String
        minus4.minus4("55", "50");

        Methods method = new Methods();
        String text1 = method.plus1(2,3);//variant #1
        System.out.println(text1);
        String text2 = method.plus2(2,3);//variant #2
        System.out.println(text2);



    }
}
