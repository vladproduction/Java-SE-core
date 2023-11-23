package vladproduction.com.Unary_minus_plus;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int x = -a;
        System.out.println(x); //-4
        int b = 2;
        x = b * -a;
        System.out.println(x); //-8
        x = b * (-a);
        System.out.println(x); //-8 same as before but has a braces

        /*Унарный минус производит отрицательное значение. Унарный плюс производится
        симметрично унарному минусу, хотя не производит никакого эффекта.*/
    }
}
