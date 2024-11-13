package vladproduction.com.for_.for_statement;

public class MainFor {
    public static void main(String[] args) {
//        for(int count = 0; count < 10; count++){
//            System.out.print(count + " "); //0 1 2 3 4 5 6 7 8 9
//        }
//        int sum = 0;
//        for (int val = 1 ; val <= 10; val++) {
//            sum += val;
//        }
//        System.out.println("\nSum of numbers 1..10 = " + sum); //Sum of numbers 1..10 = 55
//
//        int a, b;
//        for (a = 1, b = 4; a < b; a++, b--) {
//            System.out.println("\n Start iteration");
//            System.out.println("a = " + a);
//            System.out.println("b = " + b);
//            System.out.println("Finish iteration");
//        }
//        /*Start iteration
//        a = 1
//        b = 4
//        Finish iteration
//
//        Start iteration
//        a = 2
//        b = 3
//        Finish iteration*/

        System.out.println("===");
        int num = 10;
        while (++num > 20) {
            num++;
        }
        System.out.println(num);

    }
}
